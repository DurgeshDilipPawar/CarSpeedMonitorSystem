<<<<<<< HEAD
package com.example.speedmonitordemo.ui.viewmodel.activity;
=======
package com.example.speedmonitordemo.ui.activity
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.speedmonitordemo.databinding.ActivityMainBinding
import com.google.firebase.messaging.FirebaseMessaging
<<<<<<< HEAD
import com.google.firebase.messaging.FirebaseMessagingService

class MainActivity : AppCompatActivity() {

    // ViewBinding instance
    private lateinit var binding: ActivityMainBinding

    // ViewModel instance
    private lateinit var viewModel: MainViewModel

=======

/**
 * Main activity for the Speed Monitor app.
 * Handles initialization of the ViewModel, UI binding, and Firebase messaging.
 */
class MainActivity : AppCompatActivity() {

    // ViewBinding instance to access UI elements
    private lateinit var binding: ActivityMainBinding

    // ViewModel instance to handle business logic
    private lateinit var viewModel: MainViewModel

    /**
     * Called when the activity is created.
     * Initializes the UI binding, ViewModel, and subscribes to Firebase topics for notifications.
     *
     * @param savedInstanceState The saved instance state bundle, if any.
     */
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

<<<<<<< HEAD
        // Initialize ViewModel
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Example of Firebase messaging to handle notifications
=======
        // Initialize ViewModel using ViewModelProvider
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Subscribe to Firebase topic for speed updates
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
        FirebaseMessaging.getInstance().subscribeToTopic("speedUpdates")
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    println("Subscribed to speedUpdates topic")
                } else {
                    println("Subscription failed")
                }
            }

<<<<<<< HEAD
        // Any additional UI setup or listeners can go here
=======
        // Additional UI setup or listeners can be added here
>>>>>>> ffd27ad (feat: initial commit of complete Android project with MVVM, Firebase, Coroutines, and unit testing setup)
    }
}
