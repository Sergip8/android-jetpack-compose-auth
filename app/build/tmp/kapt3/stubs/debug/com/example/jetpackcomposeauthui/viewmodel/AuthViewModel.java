package com.example.jetpackcomposeauthui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006%"}, d2 = {"Lcom/example/jetpackcomposeauthui/viewmodel/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorList", "", "", "getErrorList", "()Ljava/util/List;", "setErrorList", "(Ljava/util/List;)V", "<set-?>", "Lcom/example/jetpackcomposeauthui/viewmodel/AuthState;", "state", "getState", "()Lcom/example/jetpackcomposeauthui/viewmodel/AuthState;", "setState", "(Lcom/example/jetpackcomposeauthui/viewmodel/AuthState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "changeConfirmPassword", "", "rePassword", "changeEmail", "email", "changeName", "name", "changePassword", "password", "delay", "Ljava/util/TimerTask;", "login", "context", "Landroid/content/Context;", "register", "validate", "value", "field", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.String> errorList;
    
    @javax.inject.Inject
    public AuthViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.jetpackcomposeauthui.viewmodel.AuthState getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomposeauthui.viewmodel.AuthState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getErrorList() {
        return null;
    }
    
    public final void setErrorList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> p0) {
    }
    
    public final void changeEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email) {
    }
    
    public final void changePassword(@org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void changeName(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    public final void changeConfirmPassword(@org.jetbrains.annotations.NotNull
    java.lang.String rePassword) {
    }
    
    private final void validate(java.lang.String value, java.lang.String field) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.TimerTask delay() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void register(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
}