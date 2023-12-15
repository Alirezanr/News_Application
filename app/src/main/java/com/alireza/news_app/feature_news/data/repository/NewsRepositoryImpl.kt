package com.alireza.news_app.feature_news.data.repository

import com.alireza.news_app.core.domain.ResultWrapper
import com.alireza.news_app.core.data.safeApiCall
import com.alireza.news_app.di.IoDispatcher
import com.alireza.news_app.feature_news.data.remote.NewsApi
import com.alireza.news_app.feature_news.data.remote.dto.toDomain
import com.alireza.news_app.feature_news.domain.model.News
import com.alireza.news_app.feature_news.domain.repository.NewsRepository
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val service: NewsApi,
    @IoDispatcher private val dispatcher: CoroutineDispatcher,
) : NewsRepository {

    override suspend fun getTopHeadlines(): ResultWrapper<News> = safeApiCall(dispatcher) {
        service.getTopHeadlines("en", 1, 2)
            .toDomain()
    }
}