package com.alireza.news.newsList.data.dataSource.remote

import com.alireza.news.newsList.data.dataSource.local.entity.NewsArticleEntity
import kotlinx.coroutines.flow.Flow

interface NewsListRemoteDataSource {

    suspend fun fetchNewsList(): Flow<List<NewsArticleEntity>>
}
