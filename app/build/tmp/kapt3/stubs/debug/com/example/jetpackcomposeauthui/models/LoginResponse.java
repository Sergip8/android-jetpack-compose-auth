package com.example.jetpackcomposeauthui.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/example/jetpackcomposeauthui/models/LoginResponse;", "", "status", "", "message", "user", "Lcom/example/jetpackcomposeauthui/models/UserResponse;", "authorisation", "Lcom/example/jetpackcomposeauthui/models/JwtAuth;", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/jetpackcomposeauthui/models/UserResponse;Lcom/example/jetpackcomposeauthui/models/JwtAuth;)V", "getAuthorisation", "()Lcom/example/jetpackcomposeauthui/models/JwtAuth;", "getMessage", "()Ljava/lang/String;", "getStatus", "getUser", "()Lcom/example/jetpackcomposeauthui/models/UserResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class LoginResponse {
    @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull
    @com.squareup.moshi.Json(name = "message")
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "user")
    private final com.example.jetpackcomposeauthui.models.UserResponse user = null;
    @org.jetbrains.annotations.Nullable
    @com.squareup.moshi.Json(name = "authorisation")
    private final com.example.jetpackcomposeauthui.models.JwtAuth authorisation = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.jetpackcomposeauthui.models.LoginResponse copy(@org.jetbrains.annotations.NotNull
    java.lang.String status, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    com.example.jetpackcomposeauthui.models.UserResponse user, @org.jetbrains.annotations.Nullable
    com.example.jetpackcomposeauthui.models.JwtAuth authorisation) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public LoginResponse(@org.jetbrains.annotations.NotNull
    java.lang.String status, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    com.example.jetpackcomposeauthui.models.UserResponse user, @org.jetbrains.annotations.Nullable
    com.example.jetpackcomposeauthui.models.JwtAuth authorisation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.jetpackcomposeauthui.models.UserResponse component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.jetpackcomposeauthui.models.UserResponse getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.jetpackcomposeauthui.models.JwtAuth component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.jetpackcomposeauthui.models.JwtAuth getAuthorisation() {
        return null;
    }
}