package com.alireza.newsApp.news.domain.use_case

import com.alireza.newsApp.core.domain.ResultWrapper
import com.alireza.newsApp.news.domain.model.News
import com.alireza.newsApp.news.domain.repository.NewsRepository
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class GetTopHeadlinesUseCase @Inject constructor(
    private val repository: NewsRepository
) {
    suspend operator fun invoke(): ResultWrapper<News> =
        repository.getTopHeadlines()
}