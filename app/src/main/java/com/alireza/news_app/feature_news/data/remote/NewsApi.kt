package com.alireza.news_app.feature_news.data.remote

import com.alireza.news_app.feature_news.data.remote.dto.NewsDto
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET(EVERY_THING)
    suspend fun searchForNews(
        @Query("q") searchQuery: String,
        @Query("pageSize") pageSize: Int,
        @Query("page") page: Int,
    ): List<NewsDto>

    @GET(TOP_HEADLINES)
    suspend fun getTopHeadlines(
        @Query("language") language: String,
        @Query("pageSize") pageSize: Int,
        @Query("page") page: Int,
    ): NewsDto

    companion object {
        const val VERSION = "/v2"
        const val TOP_HEADLINES = "$VERSION/top-headlines"
        const val EVERY_THING = "$VERSION/everything"
    }
}