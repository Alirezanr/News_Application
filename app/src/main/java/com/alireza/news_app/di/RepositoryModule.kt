package com.alireza.news_app.di

import com.alireza.news_app.feature_news.data.remote.NewsApi
import com.alireza.news_app.feature_news.data.repository.NewsRepositoryImpl
import com.alireza.news_app.feature_news.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(service: NewsApi): NewsRepository =
        NewsRepositoryImpl(
            service = service,
            //Todo: provide dispatchers.
            dispatcher = Dispatchers.IO
        )
}
