package com.alireza.news.newsList.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alireza.news.newsList.data.local.entity.NewsArticleEntity


@Database(
    entities = [NewsArticleEntity::class],
    version = 1,
)
abstract class NewsDatabase : RoomDatabase() {
    abstract val dao: NewsDao
}