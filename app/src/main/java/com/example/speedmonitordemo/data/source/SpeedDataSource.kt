package com.example.speedmonitordemo.data.source

/**
 * Local in-memory data source to store speed limits for customers.
 * This class provides methods to set and retrieve speed limits associated with customer IDs.
 * The data is stored in a mutable map, where each key is a customer ID and the value is the corresponding speed limit.
 *
 * @constructor Initializes the in-memory storage for speed limits.
 */
class SpeedDataSource {

    // In-memory map to store customer speed limits.
    private val speedLimits: MutableMap<String, Int> = mutableMapOf()

    /**
     * Sets the speed limit for a specific customer.
     *
     * @param customerId The unique identifier for the customer.
     * @param limit The speed limit to be set for the customer.
     */
    fun setLimit(customerId: String, limit: Int) {
        speedLimits[customerId] = limit
    }

    /**
     * Retrieves the speed limit for a specific customer.
     *
     * @param customerId The unique identifier for the customer.
     * @return The speed limit for the customer, or null if no limit is set for the customer.
     */
    fun getLimit(customerId: String): Int? {
        return speedLimits[customerId]
    }
}
