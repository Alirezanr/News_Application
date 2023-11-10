package com.alireza.news.di

import android.content.Context
import androidx.room.Room
import com.alireza.news.newsList.data.dataSource.local.NewsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalCacheModule {

    companion object {
        @Provides
        @Singleton
        fun provideDatabase(
            @ApplicationContext context: Context
        ): NewsDatabase {
            return Room.databaseBuilder(context, NewsDatabase::class.java, "news_app.db").build()
        }
    }
}