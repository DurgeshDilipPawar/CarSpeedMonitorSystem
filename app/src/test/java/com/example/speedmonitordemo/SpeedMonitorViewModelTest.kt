package com.example.speedmonitordemo

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.speedmonitordemo.data.repository.SpeedMonitorRepository
import com.example.speedmonitordemo.data.source.SpeedDataSource
import com.example.speedmonitordemo.service.FirebaseService
import com.example.speedmonitordemo.ui.viewmodel.SpeedMonitorViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.test.assertEquals

class SpeedMonitorViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: SpeedMonitorViewModel

    @Before
    fun setup() {
        Dispatchers.setMain(Dispatchers.Unconfined)
        val repository = SpeedMonitorRepository(SpeedDataSource(), FirebaseService())
        viewModel = SpeedMonitorViewModel(repository)
    }

    @After
    fun teardown() {
        Dispatchers.resetMain()
    }

    @Test
    fun testSpeedLimitExceeded() = runBlocking {
        val customerId = "cust123"
        val limit = 60
        viewModel.setSpeedLimit(customerId, limit)
        viewModel.checkSpeed(customerId, 70)

        val alert = viewModel.speedAlert.value
        assertEquals(true, alert != null)
        assertEquals(customerId, alert?.customerId)
        assertEquals(70, alert?.currentSpeed)
        assertEquals(limit, alert?.limit)
    }
}