package com.example.jetpackcomposeauthui.data.rules

object Validator {


    fun validateRequired(field: String, name:String): String?{
        if(field.isEmpty()){

        return "el campo $name es requerido"
        }
        return null
    }
    fun validateEmail(field: String): String? {
        val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\$"
        if(!field.matches(emailRegex.toRegex()))
            return "el formato de email no es correcto"
        return null
    }
    fun validatePassword(password: String, rePassword:String): String?{
        if(password != rePassword){

            return "error al comprobar el password"
        }
        return null
    }

}







