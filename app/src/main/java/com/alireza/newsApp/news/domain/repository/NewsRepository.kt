package com.alireza.newsApp.news.domain.repository

import com.alireza.newsApp.core.domain.ResultWrapper
import com.alireza.newsApp.news.domain.model.News

interface NewsRepository {

    suspend fun getTopHeadlines(): ResultWrapper<News>

}