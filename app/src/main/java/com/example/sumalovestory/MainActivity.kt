package com.example.sumalovestory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.sumalovestory.ui.theme.AppTheme
import com.example.sumalovestory.ui.HomeScreen

class MainActivity : ComponentActivity() {

    private val viewModel: LoveStoryViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                HomeScreen(viewModel = viewModel)
            }
        }
    }
}