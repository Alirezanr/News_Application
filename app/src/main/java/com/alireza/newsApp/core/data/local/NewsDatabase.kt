package com.alireza.newsApp.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alireza.newsApp.news.data.local.NewsDao
import com.alireza.newsApp.news.data.local.entity.NewsArticleEntity


@Database(
    entities = [NewsArticleEntity::class],
    version = 1,
)
abstract class NewsDatabase : RoomDatabase() {
    abstract val dao: NewsDao
}