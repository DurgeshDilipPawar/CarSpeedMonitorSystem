package com.example.speedmonitordemo.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.speedmonitordemo.databinding.ActivityMainBinding
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService

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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize ViewModel
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Example of Firebase messaging to handle notifications

        // Initialize ViewModel using ViewModelProvider
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Subscribe to Firebase topic for speed updates
        FirebaseMessaging.getInstance().subscribeToTopic("speedUpdates")
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    println("Subscribed to speedUpdates topic")
                } else {
                    println("Subscription failed")
                }
            }


        // Any additional UI setup or listeners can go here

        // Additional UI setup or listeners can be added here
    }
}
