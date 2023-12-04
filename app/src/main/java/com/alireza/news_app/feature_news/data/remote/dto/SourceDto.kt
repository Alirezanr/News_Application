package com.alireza.news_app.feature_news.data.remote.dto

import com.alireza.news_app.feature_news.domain.model.NewsSource
import com.squareup.moshi.Json


data class SourceDto(
    @field:Json(name = "id")
    val id: String,
    @field:Json(name = "name")
    val name: String
)

fun SourceDto.toDomain() =
    NewsSource(
        id = id,
        name = name,
    )