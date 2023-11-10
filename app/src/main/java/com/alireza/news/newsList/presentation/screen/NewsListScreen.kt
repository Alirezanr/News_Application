package com.alireza.news.newsList.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.alireza.news.newsList.presentation.viewModel.NewsListViewModel

@Composable
fun NewsListScreen(newsListViewModel: NewsListViewModel = hiltViewModel()) {
    val uiState = newsListViewModel.uiState

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "This is the first launch of the news list application!!!")
    }
}
