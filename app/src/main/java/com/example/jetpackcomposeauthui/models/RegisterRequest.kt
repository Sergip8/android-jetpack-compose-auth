package com.example.jetpackcomposeauthui.models

import com.squareup.moshi.Json

data class RegisterRequest(
    @field:Json(name = "name")
    var name: String,
    @field:Json(name = "email")
    var email: String,
    @field:Json(name = "password")
    var password: String,
    @field:Json(name = "password_confirmation")
    var passwordConfirmation: String
)
