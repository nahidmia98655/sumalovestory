package com.example.sumalovestory

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class Story(val title: String, val content: String)

class LoveStoryViewModel : ViewModel() {
    // List of all stories
    private val _stories = MutableStateFlow<List<Story>>(sampleStories())
    val stories: StateFlow<List<Story>> = _stories

    // Currently selected story for the detail screen
    private val _selectedStory = MutableStateFlow<Story?>(null)
    val selectedStory: StateFlow<Story?> = _selectedStory

    /** Select a story – called from the list when a user taps an item */
    fun selectStory(story: Story) {
        _selectedStory.value = story
    }

    private fun sampleStories(): List<Story> = listOf(
        Story(
            title = "First Meeting",
            content = "They met under the cherry blossom tree..."
        ),
        Story(
            title = "A Sweet Surprise",
            content = "He left a note in her lunchbox..."
        ),
        Story(
            title = "Starlit Promise",
            content = "Under a sky full of stars they promised forever..."
        ),
        Story(
            title = "Rainy Day Café",
            content = "A rainy afternoon turned into a cozy coffee chat..."
        ),
        Story(
            title = "Summer Festival",
            content = "Lights, fireworks, and a whispered confession at the festival..."
        )
    )
}
