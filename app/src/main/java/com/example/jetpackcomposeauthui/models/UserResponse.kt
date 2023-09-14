package com.example.jetpackcomposeauthui.models

import com.squareup.moshi.Json


data class UserResponse (
    @field:Json(name = "id")
    val id:Int ,
    @field:Json(name = "name")
    val name:String,
    @field:Json(name = "email")
    val email: String
)
