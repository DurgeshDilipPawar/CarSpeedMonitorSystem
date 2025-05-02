package com.example.speedmonitordemo.domain

/**
 * Interface defining the contract for sending speed alert notifications.
 * Implementing classes are responsible for providing the actual logic for sending the alerts.
 */
interface SpeedAlertInterface {

    /**
     * Sends a speed alert notification with the provided message.
     *
     * @param message The message to be sent in the alert notification.
     */
    fun sendAlert(message: String)
}
