package com.alireza.newsApp.news.data.repository

import com.alireza.newsApp.core.domain.ResultWrapper
import com.alireza.newsApp.core.data.safeApiCall
import com.alireza.newsApp.di.IoDispatcher
import com.alireza.newsApp.news.data.remote.NewsApi
import com.alireza.newsApp.news.data.remote.dto.toDomain
import com.alireza.newsApp.news.domain.model.News
import com.alireza.newsApp.news.domain.repository.NewsRepository
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