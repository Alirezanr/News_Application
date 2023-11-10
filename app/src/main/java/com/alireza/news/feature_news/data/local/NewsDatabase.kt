package com.alireza.news.feature_news.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alireza.news.feature_news.data.local.entity.NewsArticleEntity


@Database(
    entities = [NewsArticleEntity::class],
    version = 1,
)
abstract class NewsDatabase : RoomDatabase() {
    abstract val dao: NewsDao
}