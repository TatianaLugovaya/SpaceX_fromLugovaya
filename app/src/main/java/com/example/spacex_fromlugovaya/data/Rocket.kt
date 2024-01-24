package com.example.spacex_fromlugovaya.data
data class Rocket(
    val rocketId: String?,
    val rocketName: String?,
    val rocketImage: String,
    val rocketHeightInMeters: Double?,
    val rocketHeightInFeet: Double?,
    val rocketDiameterInMeters: Double?,
    val rocketDiameterInFeet: Double?,
    val rocketMassInKg: Int?,
    val rocketMassInLb: Int?,
    val rocketPayloadWeightsInKg: Int?,
    val rocketPayloadWeightsInLb: Int?,
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