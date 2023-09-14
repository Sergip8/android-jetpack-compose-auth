package com.example.jetpackcomposeauthui.models

import com.squareup.moshi.Json

data class JwtAuth(
    @field:Json(name = "token")
    val token: String,
    @field:Json(name = "type")
    val type: String,
    @field:Json(name = "expires_in")
    val expiresIn: Int
)
