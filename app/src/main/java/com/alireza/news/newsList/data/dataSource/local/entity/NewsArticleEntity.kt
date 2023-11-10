package com.alireza.news.newsList.data.dataSource.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "news_articles")
data class NewsArticleEntity(
    @PrimaryKey(autoGenerate = false)
    val url: String,
    val title: String?,
    val urlToImage: String?
)