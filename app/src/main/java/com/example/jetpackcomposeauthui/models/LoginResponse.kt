package com.example.jetpackcomposeauthui.models

import com.squareup.moshi.Json


data class LoginResponse(
    @field:Json(name = "status")
    val status: String,
    @field:Json(name = "message")
    val message: String,
    @field:Json(name = "user")
    val user: UserResponse?,
    @field:Json(name = "authorisation")
    val authorisation: JwtAuth?
)
