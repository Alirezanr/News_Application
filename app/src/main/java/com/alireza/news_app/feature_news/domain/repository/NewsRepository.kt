package com.alireza.news_app.feature_news.domain.repository

import com.alireza.news_app.core.domain.ResultWrapper
import com.alireza.news_app.feature_news.domain.model.News

interface NewsRepository {

    suspend fun getTopHeadlines(): ResultWrapper<News>

}