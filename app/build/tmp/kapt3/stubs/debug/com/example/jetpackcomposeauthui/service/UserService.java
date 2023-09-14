package com.example.jetpackcomposeauthui.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/jetpackcomposeauthui/service/UserService;", "", "login", "Lretrofit2/Response;", "Lcom/example/jetpackcomposeauthui/models/LoginResponse;", "loginRequest", "Lcom/example/jetpackcomposeauthui/models/LoginRequest;", "(Lcom/example/jetpackcomposeauthui/models/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lcom/example/jetpackcomposeauthui/models/RegisterRequest;", "registerRequest", "(Lcom/example/jetpackcomposeauthui/models/RegisterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "login")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.jetpackcomposeauthui.models.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jetpackcomposeauthui.models.LoginResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "signup")
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.example.jetpackcomposeauthui.models.RegisterRequest registerRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.jetpackcomposeauthui.models.RegisterRequest>> continuation);
}