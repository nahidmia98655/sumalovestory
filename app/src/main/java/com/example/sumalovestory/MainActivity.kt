package com.example.sumalovestory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sumalovestory.ui.theme.AppTheme
import com.example.sumalovestory.ui.HomeScreen
import com.example.sumalovestory.ui.StoryDetailScreen

class MainActivity : ComponentActivity() {

    private val viewModel: LoveStoryViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") {
                        HomeScreen(viewModel = viewModel, navController = navController)
                    }
                    composable("detail") {
                        StoryDetailScreen(viewModel = viewModel, navController = navController)
                    }
                }
            }
        }
    }
}
