package com.alireza.news.newsList.data.repository

import com.alireza.news.newsList.data.dataSource.local.entity.NewsArticleEntity
import kotlinx.coroutines.flow.Flow

interface NewsListRepository {

    suspend fun fetchNewsList(): Flow<List<NewsArticleEntity>>
}
