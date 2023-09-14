package com.example.jetpackcomposeauthui.data

import android.content.Context
import android.content.SharedPreferences
import com.example.jetpackcomposeauthui.models.JwtAuth
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class SessionManager @Inject constructor(@ApplicationContext context: Context) {
    companion object {
        const val PREFS_TOKEN_FILE = "token_file"
        const val USER_REFRESH_TOKEN = "user_refresh_token"
        const val IS_LOGGED_IN = "is_logged"
        const val USER_TOKEN = "user_token"


    }
    private var prefs: SharedPreferences =
        context.getSharedPreferences(PREFS_TOKEN_FILE, Context.MODE_PRIVATE)

    fun saveToken(token: JwtAuth?) {
        val editor = prefs.edit()

        token?.let {
            editor.putString(USER_TOKEN, token.token).apply()
            //editor.putString(USER_REFRESH_TOKEN,token.refresh_token).apply()
            editor.putBoolean(IS_LOGGED_IN,true).apply ()
        }
    }

    fun getToken(): String? {
        return prefs.getString(USER_TOKEN, null)
    }

    fun getRefreshToken(): String? {
        return prefs.getString(USER_REFRESH_TOKEN, null)
    }}