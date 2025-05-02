package com.example.speedmonitordemo.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.speedmonitordemo.data.model.SpeedAlert
import com.example.speedmonitordemo.data.repository.SpeedMonitorRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
<<<<<<< HEAD
 * ViewModel for monitoring speed and notifying if the speed exceeds limit.
 */
class SpeedMonitorViewModel(private val repository: SpeedMonitorRepository) : ViewModel() {

    private val _speedAlert = MutableLiveData<SpeedAlert?>()
    val speedAlert: LiveData<SpeedAlert?> = _speedAlert

    private val viewModelJob = Job()
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

=======
 * ViewModel for monitoring speed and notifying if the speed exceeds the limit.
 * It interacts with the repository to fetch the speed limit and sends notifications
 * if the speed exceeds the limit.
 *
 * @param repository The repository instance used to interact with data sources.
 */
class SpeedMonitorViewModel(private val repository: SpeedMonitorRepository) : ViewModel() {

    // LiveData to observe speed alerts
    private val _speedAlert = MutableLiveData<SpeedAlert?>()
    val speedAlert: LiveData<SpeedAlert?> = _speedAlert

    // Job to manage the lifecycle of the ViewModel's coroutine scope
    private val viewModelJob = Job()

    // Coroutine scope used for managing asynchronous tasks in the ViewModel
    private val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    /**
     * Sets the speed limit for a specific customer.
     *
     * @param customerId The ID of the customer.
     * @param speedLimit The speed limit to be set for the customer.
     */
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
    fun setSpeedLimit(customerId: String, speedLimit: Int) {
        repository.setSpeedLimit(customerId, speedLimit)
    }

<<<<<<< HEAD
    fun checkSpeed(customerId: String, currentSpeed: Int) {
        uiScope.launch {
            val limit = repository.getSpeedLimit(customerId)
            if (limit != null && currentSpeed > limit) {
=======
    /**
     * Checks if the current speed exceeds the speed limit for a specific customer.
     * If exceeded, it sends an alert and updates the [speedAlert] LiveData.
     *
     * @param customerId The ID of the customer.
     * @param currentSpeed The current speed of the vehicle.
     */
    fun checkSpeed(customerId: String, currentSpeed: Int) {
        uiScope.launch {
            // Get the speed limit from the repository
            val limit = repository.getSpeedLimit(customerId)

            // Check if the current speed exceeds the limit
            if (limit != null && currentSpeed > limit) {
                // Create a new SpeedAlert object and update LiveData
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
                _speedAlert.value = SpeedAlert(
                    customerId = customerId,
                    currentSpeed = currentSpeed,
                    limit = limit,
                    message = "Speed limit exceeded!"
                )
<<<<<<< HEAD
=======
                // Send notification using repository
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
                repository.sendAlertNotification(customerId, currentSpeed, limit)
            } else {
                _speedAlert.value = null
            }
        }
    }

<<<<<<< HEAD
=======
    /**
     * Cancels the ongoing coroutines when the ViewModel is cleared.
     * This helps to avoid memory leaks by canceling background work.
     */
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
}
