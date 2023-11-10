package com.alireza.news.newsList.data.dataSource.remote.api

import com.alireza.news.newsList.data.dataSource.local.entity.NewsArticleEntity
import retrofit2.http.GET

interface NewsApi {

    @GET("")
    suspend fun fetchNews(): List<NewsArticleEntity>
}
