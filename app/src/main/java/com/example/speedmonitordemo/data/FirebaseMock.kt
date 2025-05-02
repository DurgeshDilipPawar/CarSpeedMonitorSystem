package com.example.speedmonitordemo.data

class FirebaseMock {

/**
 * Mock class to simulate the behavior of a Firebase notification service.
 * This is a mock implementation intended for testing purposes, simulating the sending of notifications.
 *
 * @constructor Creates an instance of FirebaseMock to simulate sending notifications.
 */
class FirebaseMock {

    /**
     * Simulates sending a notification through Firebase.
     * In this mock implementation, it simply prints the message to the console.
     *
     * @param message The message to be sent in the notification.
     */
    fun sendNotification(message: String) {
        // Simulate sending a Firebase notification
        println("Notification Sent: $message")
    }
}

}
