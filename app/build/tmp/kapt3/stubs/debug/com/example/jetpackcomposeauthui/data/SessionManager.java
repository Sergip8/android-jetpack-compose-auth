package com.example.jetpackcomposeauthui.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/jetpackcomposeauthui/data/SessionManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "getRefreshToken", "", "getToken", "saveToken", "", "token", "Lcom/example/jetpackcomposeauthui/models/JwtAuth;", "Companion", "app_debug"})
public final class SessionManager {
    @org.jetbrains.annotations.NotNull
    public static final com.example.jetpackcomposeauthui.data.SessionManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PREFS_TOKEN_FILE = "token_file";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_REFRESH_TOKEN = "user_refresh_token";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_LOGGED_IN = "is_logged";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_TOKEN = "user_token";
    private android.content.SharedPreferences prefs;
    
    @javax.inject.Inject
    public SessionManager(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        super();
    }
    
    public final void saveToken(@org.jetbrains.annotations.Nullable
    com.example.jetpackcomposeauthui.models.JwtAuth token) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRefreshToken() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/jetpackcomposeauthui/data/SessionManager$Companion;", "", "()V", "IS_LOGGED_IN", "", "PREFS_TOKEN_FILE", "USER_REFRESH_TOKEN", "USER_TOKEN", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}