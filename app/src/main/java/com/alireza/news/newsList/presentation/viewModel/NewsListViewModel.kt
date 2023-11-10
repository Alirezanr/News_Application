package com.alireza.news.newsList.presentation.viewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alireza.news.newsList.data.dataSource.local.entity.NewsArticleEntity
import com.alireza.news.newsList.data.repository.NewsListRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsListViewModel @Inject constructor(
    private val newsListRepository: NewsListRepository,
) : ViewModel() {
    private val _uiState = mutableStateOf(NewsListUiState())
    val uiState: MutableState<NewsListUiState> = _uiState

    init {
        fetchNews()
    }

    private fun fetchNews() = viewModelScope.launch {
        newsListRepository
            .fetchNewsList()
            .collectLatest { news ->
                _uiState.value = _uiState.value.copy(data = news)
            }
    }
}

data class NewsListUiState(
    val data: List<NewsArticleEntity> = emptyList(),
)
