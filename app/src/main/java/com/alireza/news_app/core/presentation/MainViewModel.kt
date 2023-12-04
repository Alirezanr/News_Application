package com.alireza.news_app.core.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alireza.news_app.core.domain.ResultWrapper
import com.alireza.news_app.feature_news.domain.use_case.GetTopHeadlinesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getTopHeadlinesUseCase: GetTopHeadlinesUseCase
) : ViewModel() {

    fun testNewsApiCall() {
        viewModelScope.launch {
            when (val result = getTopHeadlinesUseCase()) {
                is ResultWrapper.GenericError -> {
                    println("GenericError" + result.error?.message)
                    println("GenericError" + result.error?.status)
                }

                is ResultWrapper.NetworkError -> {
                    println("NetworkError")
                }

                is ResultWrapper.Success -> {
                    println("Success")
                    println(result.value)
                }
            }
        }

    }
}