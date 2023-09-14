package com.example.jetpackcomposeauthui.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackcomposeauthui.data.AppModule
import com.example.jetpackcomposeauthui.data.SessionManager
import com.example.jetpackcomposeauthui.data.rules.Validator
import com.example.jetpackcomposeauthui.models.LoginRequest
import com.example.jetpackcomposeauthui.models.RegisterRequest
import com.example.jetpackcomposeauthui.service.UserService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.util.Timer
import javax.inject.Inject
import kotlin.concurrent.schedule
import kotlin.reflect.full.memberProperties

@HiltViewModel
class AuthViewModel @Inject constructor() : ViewModel() {
    var state by mutableStateOf(AuthState())
    var errorList = mutableListOf<String>()

    fun changeEmail(email: String) {
        state = state.copy(
            email = email
        )
    }

    fun changePassword(password: String) {
        state = state.copy(
            password = password
        )

    }
    fun changeName(name: String) {
        state = state.copy(
            name = name
        )

    }
    fun changeConfirmPassword(rePassword: String) {
        state = state.copy(
            passwordConfirmation = rePassword
        )

    }

    private fun validate(value: String, field: String){

        when(field){
            "email" -> {
               val error = Validator.validateEmail(value)
                if(error != null)
                    errorList.add(error)
            }
            "passwordConfirmation" -> {
                val error = Validator.validatePassword(state.password, state.passwordConfirmation)
                if(error != null)
                    errorList.add(error)
            }
            else -> {
                val error = Validator.validateRequired(value, field)
                if(error != null)
                    errorList.add(error)
            }
            }



    }


    fun delay() = Timer().schedule(2000L) {
        state = state.copy(
            errorList = mutableListOf()
        )
    }


    fun login(context: Context) {

        val request = LoginRequest(
            state.email,
            state.password
        )
        state = state.copy(
            errorList = mutableListOf()
        )
        errorList = mutableListOf()
        val req = LoginRequest::class.memberProperties
        req.forEach {

          validate(it.get(request).toString(), it.name)
            Log.i("object", "${it.name} ${it.get(request)}")
        }
        state = state.copy(
            errorList = errorList
        )


        //Log.i("flags", "password ${state.passwordIsValid} email ${state.emailIsValid}")
        if (state.errorList.size > 0) {
            delay()
            return
        }


        viewModelScope.launch {
            try {
                val response =
                    AppModule.provideRetrofit().create(UserService::class.java).login(request)

                when (response.code()) {
                    200 -> {
                        Toast.makeText(
                            context,
                            "Bienvenido ${response.body()?.user?.name}",
                            Toast.LENGTH_SHORT
                        ).show()
                        val prefs = context.getSharedPreferences(
                            SessionManager.PREFS_TOKEN_FILE,
                            Context.MODE_PRIVATE
                        )
                        val editor = prefs.edit()
                        editor.putString(
                            SessionManager.USER_TOKEN,
                            response.body()?.authorisation?.token
                        ).apply()
                        Log.i("token", prefs.getString(SessionManager.USER_TOKEN, null)!!)
                    }

                    401, 422 -> {
                        Toast.makeText(
                            context,
                            "Email o password incorrectos",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    }

                }

            } catch (e: Exception) {
                Toast.makeText(context, "Email o password incorrectos", Toast.LENGTH_SHORT)
                    .show()
            }


        }
    }

    fun register(context: Context) {
        val request = RegisterRequest(
            state.name,
            state.email,
            state.password,
            state.passwordConfirmation
        )
        state = state.copy(
            errorList = mutableListOf()
        )
        errorList = mutableListOf()
        val req = RegisterRequest::class.memberProperties
        req.forEach {

            validate(it.get(request).toString(), it.name)
            Log.i("object", "${it.name} ${it.get(request)}")
        }
        state = state.copy(
            errorList = errorList
        )

        if (state.errorList.size > 0) {
            delay()
            return
        }
        viewModelScope.launch {
            try {

            val response =
                AppModule.provideRetrofit().create(UserService::class.java).register(request)

            when(response.code()){
                201 -> {
                    Toast.makeText(
                        context,
                        "${state.name} se ha registrado correctamente",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                401, 422 -> {
                    Toast.makeText(
                        context,
                        "No se pudo registrar al usuario",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
            }
            }catch (e: Exception) {
                Toast.makeText(context, e.toString(), Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

}