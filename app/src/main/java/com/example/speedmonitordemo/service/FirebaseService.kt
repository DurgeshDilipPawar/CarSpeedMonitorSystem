package com.example.speedmonitordemo.service

import android.util.Log

/**
 * Simulated service for sending notifications via Firebase.
 */
class FirebaseService {



class FirebaseService {

    /**
     * Sends a notification to the customer if their speed exceeds the defined speed limit.
     *
     * @param customerId The ID of the customer to whom the notification is sent.
     * @param speed The current speed of the customer.
     * @param limit The predefined speed limit.
     */
    fun sendNotification(customerId: String, speed: Int, limit: Int) {
        // Replace with actual Firebase implementation
        Log.d("FirebaseService", "Notification sent to $customerId: speed $speed exceeded limit $limit")
    }
}
}
