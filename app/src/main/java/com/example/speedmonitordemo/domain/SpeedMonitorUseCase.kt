package com.example.speedmonitordemo.domain

/**
 * Use case class to handle the business logic related to speed monitoring.
 * It determines if the user's speed exceeds the set speed limit.
 */
class SpeedMonitorUseCase {

    /**
     * Checks if the user's speed exceeds the set speed limit.
     *
     * @param userSpeed The current speed of the user.
     * @param speedLimit The defined speed limit.
     * @return True if the user's speed exceeds the limit, false otherwise.
     */
    fun isSpeedExceeded(userSpeed: Int, speedLimit: Int): Boolean {
        return userSpeed > speedLimit
    }
}
