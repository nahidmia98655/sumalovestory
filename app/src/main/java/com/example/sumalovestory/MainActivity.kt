package com.example.sumalovestory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sumalovestory.ui.theme.AppTheme
import com.example.sumalovestory.ui.HomeScreen
import com.example.sumalovestory.ui.StoryDetailScreen

class MainActivity : ComponentActivity() {

    private val viewModel: LoveStoryViewModel by viewModels()

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") {
                        HomeScreen(viewModel = viewModel, navController = navController)
                    }
                    composable("detail/{title}") {
                        StoryDetailScreen(viewModel = viewModel, navController = navController)
                    }
                }
            }
        }
    }
}
