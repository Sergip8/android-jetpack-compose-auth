package com.example.jetpackcomposeauthui.viewmodel

data class AuthState(
    val name: String = "",
    val email: String = "",
    val password: String = "",
    val passwordConfirmation: String = "",

    /*val nameIsValid: Boolean = false,
    val emailIsValid: Boolean = false,
    val passwordIsValid: Boolean = false,*/

    val errorList: MutableList<String> = mutableListOf()
)
