package com.alireza.newsApp.news.data.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.alireza.newsApp.news.data.local.entity.NewsArticleEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface NewsDao {

    @Upsert
    suspend fun insertNewsArticles(articles: List<NewsArticleEntity>)

    @Query("SELECT * FROM news_articles")
    fun getNewsArticles(): Flow<List<NewsArticleEntity>>

}