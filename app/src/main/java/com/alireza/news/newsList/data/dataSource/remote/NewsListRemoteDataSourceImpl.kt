package com.alireza.news.newsList.data.dataSource.remote

import com.alireza.news.newsList.data.dataSource.local.entity.NewsArticleEntity
import com.alireza.news.newsList.data.dataSource.remote.api.NewsApi
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@ViewModelScoped
class NewsListRemoteDataSourceImpl @Inject constructor(
    private val newsApi: NewsApi,
) : NewsListRemoteDataSource {
    override suspend fun fetchNewsList(): Flow<List<NewsArticleEntity>> {
        return flow { newsApi.fetchNews() }
    }
}
