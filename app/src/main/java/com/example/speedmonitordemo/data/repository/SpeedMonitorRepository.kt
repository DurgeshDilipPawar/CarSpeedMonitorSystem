package com.example.speedmonitordemo.data.repository

import com.example.speedmonitordemo.data.source.SpeedDataSource
import com.example.speedmonitordemo.service.FirebaseService

/**
 * Repository to abstract access to data source and external services.
 * Repository to abstract access to data source and external services related to speed monitoring.
 * It manages interactions with the data layer and communicates with Firebase for alert notifications.
 *
 * @property dataSource The data source for speed limit operations.
 * @property firebaseService The Firebase service used to send alert notifications.
 */
class SpeedMonitorRepository(
    private val dataSource: SpeedDataSource,
    private val firebaseService: FirebaseService
) {


    /**
     * Sets the speed limit for a specific customer.
     *
     * @param customerId The unique identifier for the customer.
     * @param speedLimit The speed limit to be set for the customer.
     */
    fun setSpeedLimit(customerId: String, speedLimit: Int) {
        dataSource.setLimit(customerId, speedLimit)
    }


    /**
     * Retrieves the current speed limit for a specific customer.
     *
     * @param customerId The unique identifier for the customer.
     * @return The speed limit for the customer, or null if no limit is set.
     */
    fun getSpeedLimit(customerId: String): Int? {
        return dataSource.getLimit(customerId)
    }

    fun sendAlertNotification(customerId: String, speed: Int, limit: Int) {
        firebaseService.sendNotification(customerId, speed, limit)
    }

    /**
     * Sends an alert notification if the customer's speed exceeds the defined speed limit.
     *
     * @param customerId The unique identifier for the customer.
     * @param speed The current speed of the customer.
     * @param limit The speed limit that was set for the customer.
     */
    fun sendAlertNotification(customerId: String, speed: Int, limit: Int) {
        firebaseService.sendNotification(customerId, speed, limit)
    }
}
