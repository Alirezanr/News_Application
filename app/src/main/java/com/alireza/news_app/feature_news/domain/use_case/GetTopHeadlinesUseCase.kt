package com.alireza.news_app.feature_news.domain.use_case

import com.alireza.news_app.core.domain.ResultWrapper
import com.alireza.news_app.feature_news.domain.model.News
import com.alireza.news_app.feature_news.domain.repository.NewsRepository
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class GetTopHeadlinesUseCase @Inject constructor(
    private val repository: NewsRepository
) {
    suspend operator fun invoke(): ResultWrapper<News> =
        repository.getTopHeadlines()
}