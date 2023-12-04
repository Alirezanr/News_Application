package com.alireza.news_app.feature_news.domain.model

data class News(
    val articles: List<Article>?,
    val status: String?,
    val totalResults: Int?,
    val code: String?,
    val message: String?,
)