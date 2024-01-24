package com.example.spacex_fromlugovaya.data

import com.example.spacex_fromlugovaya.network.APIService

interface RocketsRepository {
    suspend fun getRockets(): List<Rocket>
}
class NetworkRocketsRepository(
    private val apiService: APIService
) : RocketsRepository {
    override suspend fun getRockets(): List<Rocket> = apiService.getRockets().map {
        Rocket(
            rocketId = it.id,
            rocketName = it.name,
            rocketImage = it.flickrImages.first(),
            rocketHeightInMeters = it.height?.meters,
            rocketHeightInFeet = it.height?.feet,
            rocketDiameterInMeters = it.diameter?.meters,
            rocketDiameterInFeet = it.diameter?.feet,
            rocketMassInKg = it.mass?.kg,
            rocketMassInLb = it.mass?.lb,
            rocketPayloadWeightsInKg = it.payloadWeights.first().kg,
            rocketPayloadWeightsInLb = it.payloadWeights.first().lb,
            rocketFirstFlight = it.firstFlight,
            rocketCountry = it.country,
            rocketCostPerLaunch = it.costPerLaunch,
            rocketFirstStageEngines = it.firstStage?.engines,
            rocketFirstStageFuelAmountTons = it.firstStage?.fuelAmountTons,
            rocketFirstStageBurnTimeSec = it.firstStage?.burnTimeSec,
            rocketSecondStageEngines = it.secondStage?.engines,
            rocketSecondStageFuelAmountTons = it.secondStage?.fuelAmountTons,
            rocketSecondStageBurnTimeSec = it.secondStage?.burnTimeSec
        )
    }
}