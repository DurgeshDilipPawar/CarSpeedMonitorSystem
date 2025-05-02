package com.example.speedmonitordemo.service

import android.util.Log

/**
<<<<<<< HEAD
 * Simulated service for sending notifications via Firebase.
 */
class FirebaseService {

=======
 * Service class to handle sending notifications via Firebase.
 * This is a simulated version and can be replaced with actual Firebase implementation.
 */
class FirebaseService {

    /**
     * Sends a notification to the customer if their speed exceeds the defined speed limit.
     *
     * @param customerId The ID of the customer to whom the notification is sent.
     * @param speed The current speed of the customer.
     * @param limit The predefined speed limit.
     */
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
    fun sendNotification(customerId: String, speed: Int, limit: Int) {
        // Replace with actual Firebase implementation
        Log.d("FirebaseService", "Notification sent to $customerId: speed $speed exceeded limit $limit")
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
