package com.alireza.news_app.feature_news.data.remote.dto

import com.alireza.news_app.feature_news.domain.model.News
import com.squareup.moshi.Json


data class NewsDto(
    @field:Json(name = "articles")
    val articles: List<ArticleDto>? = null,
    @field:Json(name = "status")
    val status: String? = null,
    @field:Json(name = "totalResults")
    val totalResults: Int? = null,
    @field:Json(name = "code")
    val code: String? = null,
    @field:Json(name = "message")
    val message: String? = null,
)

fun NewsDto.toDomain(): News =
    News(
        articles = articles?.map { it.toDomain() },
        status = status,
        totalResults = totalResults,
        code = code,
        message = message,
    )