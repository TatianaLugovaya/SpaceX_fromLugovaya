package com.example.spacex_fromlugovaya.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.spacex_fromlugovaya.RocketsApplication
import com.example.spacex_fromlugovaya.data.Rocket
import com.example.spacex_fromlugovaya.data.RocketsRepository
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException

sealed interface RocketsUiState {
    data class Success(val rockets: List<Rocket>) : RocketsUiState
    object Error : RocketsUiState
    object Loading : RocketsUiState
}
class RocketsViewModel(
    private val rocketsRepository: RocketsRepository
) : ViewModel() {

    var rocketsUiSate: RocketsUiState by mutableStateOf(RocketsUiState.Loading)
        private set

    init {
        getRockets()
    }

    fun getRockets() {
        viewModelScope.launch {
            rocketsUiSate = RocketsUiState.Loading
            rocketsUiSate = try {
                RocketsUiState.Success(rocketsRepository.getRockets())
            } catch (e: IOException) {
                RocketsUiState.Error
            } catch (e: HttpException) {
                RocketsUiState.Error
            }

        }
    }

    companion object {
        val factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as RocketsApplication)
                val rocketsRepository = application.container.rocketsRepository
                RocketsViewModel(rocketsRepository = rocketsRepository)
            }
        }
    }
}