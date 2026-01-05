package com.example.sumalovestory

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class Story(val title: String, val content: String)

class LoveStoryViewModel : ViewModel() {
    private val _stories = MutableStateFlow<List<Story>>(sampleStories())
    val stories: StateFlow<List<Story>> = _stories

    private fun sampleStories(): List<Story> = listOf(
        Story(
            title = "First Meeting",
            content = "They met under the cherry blossom tree..."
        ),
        Story(
            title = "A Sweet Surprise",
            content = "He left a note in her lunchbox..."
        )
    )
}