package com.example.speedmonitordemo.data.model

/**
 * Model class representing a speed alert for a customer.
<<<<<<< HEAD
=======
 * This class holds information about the customer's speed, the speed limit,
 * and the alert message to be shown when the speed limit is exceeded.
 *
 * @property customerId The unique identifier for the customer.
 * @property currentSpeed The current speed of the customer.
 * @property limit The speed limit set for the customer.
 * @property message The message to be displayed in the alert.
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
 */
data class SpeedAlert(
    val customerId: String,
    val currentSpeed: Int,
    val limit: Int,
    val message: String
<<<<<<< HEAD
)
=======
)
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
