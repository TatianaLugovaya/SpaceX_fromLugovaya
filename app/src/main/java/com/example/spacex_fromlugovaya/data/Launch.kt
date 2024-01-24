package com.example.spacex_fromlugovaya.data

data class Launch(
    val rocketName: String?,
    val rocketImage: String,
    val rocketHeight: Double?,
    val rocketDiameter: Double?,
    val rocketMass: Int?,
    val rocketPayloadWeights: Int?,
    val rocketFirstFlight: String?,
    val rocketCountry: String?,
    val rocketCostPerLaunch: Int?,
    val rocketFirstStageEngines: Int?,
    val rocketFirstStageFuelAmountTons: Double?,
    val rocketFirstStageBurnTimeSec: Int?,
    val rocketSecondStageEngines: Int?,
    val rocketSecondStageFuelAmountTons: Double?,
    val rocketSecondStageBurnTimeSec: Int?
)