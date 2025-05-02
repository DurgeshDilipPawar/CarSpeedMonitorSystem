package com.example.speedmonitordemo.utils

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

/**
 * Service class for handling Firebase messaging.
 * This class extends [FirebaseMessagingService] and is responsible for receiving and processing
 * messages sent from Firebase Cloud Messaging (FCM).
 */
class MyFirebaseMessagingService : FirebaseMessagingService() {

    /**
     * Called when a new message is received.
     *
     * This method processes the received [RemoteMessage], checks if the message contains
     * a notification and handles the data payload if present.
     *
     * @param remoteMessage The [RemoteMessage] object containing the notification and/or data payload.
     */
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Check if the message contains a notification
        if (remoteMessage.notification != null) {
            Log.d("FirebaseMessage", "Message Notification Body: ${remoteMessage.notification?.body}")
        }

        // Handle the data payload if necessary
        if (remoteMessage.data.isNotEmpty()) {
            Log.d("FirebaseMessage", "Message data payload: ${remoteMessage.data}")
        }
    }


    /**
     * Called when a new Firebase token is generated.
     *
     * This method allows you to handle the new token, which can be used to send
     * push notifications to this device. You may want to send this token to your server
     * for future use in targeting specific devices.
     *
     * @param token The new Firebase token associated with the device.
     */
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        // Handle the new token (e.g., send it to your server if needed)
        Log.d("FirebaseMessage", "New Firebase Token: $token")
    }
}
