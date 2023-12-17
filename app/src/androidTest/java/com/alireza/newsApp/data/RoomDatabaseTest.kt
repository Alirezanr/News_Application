package com.alireza.newsApp.data

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.alireza.newsApp.core.data.local.NewsDatabase
import com.alireza.newsApp.news.data.local.entity.NewsArticleEntity
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import app.cash.turbine.test
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class RoomDatabaseTest {

    private lateinit var db: NewsDatabase

    @Before
    fun setup() {
        db = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            NewsDatabase::class.java
        )
            .allowMainThreadQueries()
            .build()
    }

    @After
    fun teardown() {
        db.close()
    }

    @Test
    fun ensureInsertIntoNewsArticleEntityWorksProperly() = runTest {
        val dao = db.dao
        val newsArticles = dao.getNewsArticles()

        val articles = listOf(
            NewsArticleEntity(
                url = "1",
                title = "1",
                urlToImage = "1",
            ),
            NewsArticleEntity(
                url = "2",
                title = "2",
                urlToImage = "2",
            ),
            NewsArticleEntity(
                url = "3",
                title = "3",
                urlToImage = "3",
            ),
        )
        dao.insertNewsArticles(articles)

        newsArticles.test {
            assertThat(awaitItem().size).isEqualTo(3)
        }
    }


}