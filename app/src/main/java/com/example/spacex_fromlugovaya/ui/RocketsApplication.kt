package com.example.spacex_fromlugovaya.ui

import android.app.Application
import com.example.spacex_fromlugovaya.data.AppContainer
import com.example.spacex_fromlugovaya.data.DefaultAppContainer

class RocketsApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}