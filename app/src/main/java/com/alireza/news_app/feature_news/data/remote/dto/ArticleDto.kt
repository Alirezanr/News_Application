package com.alireza.news_app.feature_news.data.remote.dto

import com.alireza.news_app.feature_news.domain.model.Article
import com.squareup.moshi.Json


data class ArticleDto(
    @field:Json(name = "author")
    val author: String?,
    @field:Json(name = "content")
    val content: String?,
    @field:Json(name = "description")
    val description: String?,
    @field:Json(name = "publishedAt")
    val publishedAt: String?,
    @field:Json(name = "source")
    val source: SourceDto?,
    @field:Json(name = "title")
    val title: String?,
    @field:Json(name = "url")
    val url: String?,
    @field:Json(name = "urlToImage")
    val urlToImage: String?,
)

fun ArticleDto.toDomain() =
    Article(
        author = author,
        content = content,
        description = description,
        publishedAt = publishedAt,
        source = source?.toDomain(),
        title = title,
        url = url,
        urlToImage = urlToImage,
    )