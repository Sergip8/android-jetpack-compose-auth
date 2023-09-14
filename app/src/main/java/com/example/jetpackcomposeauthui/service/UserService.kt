package com.example.jetpackcomposeauthui.service

import com.example.jetpackcomposeauthui.models.LoginRequest
import com.example.jetpackcomposeauthui.models.LoginResponse
import com.example.jetpackcomposeauthui.models.RegisterRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserService {

    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>

    @POST("signup")
    suspend fun register(@Body registerRequest: RegisterRequest): Response<RegisterRequest>

}