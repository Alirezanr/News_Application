package com.alireza.news_app.core.data.model

import com.alireza.news_app.core.domain.model.ApiError
import com.squareup.moshi.Json


data class ApiErrorDto(
    @field:Json(name = "code")
    val code: String?,
    @field:Json(name = "message")
    val message: String?,
    @field:Json(name = "status")
    val status: String?
)

fun ApiErrorDto.toDomain() =
    ApiError(
        code = code,
        message = message,
        status = status
    )