package com.alireza.news.newsList.data.repository

import com.alireza.news.newsList.data.dataSource.local.entity.NewsArticleEntity
import com.alireza.news.newsList.data.dataSource.remote.NewsListRemoteDataSource
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class NewsListRepositoryImpl @Inject constructor(
    private val remoteDataSource: NewsListRemoteDataSource,
) : NewsListRepository {
    override suspend fun fetchNewsList(): Flow<List<NewsArticleEntity>> {
        return remoteDataSource.fetchNewsList()
    }
}
