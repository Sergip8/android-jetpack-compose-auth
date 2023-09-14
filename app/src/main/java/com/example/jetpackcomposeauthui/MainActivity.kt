package com.example.jetpackcomposeauthui

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeauthui.ui.theme.JetpackComposeAuthUITheme
import com.example.jetpackcomposeauthui.viewmodel.AuthViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {

            JetpackComposeAuthUITheme {
                /// Let just add navigation so users can go from one screen to another
                NavigationView()
            }
        }
/*    ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)){
        view, inserts ->
        val bottom = inserts.getInsets(WindowInsetsCompat.Type.ime()).bottom
        view.updatePadding(bottom = bottom)
        inserts
    }*/
    }
}

@Composable
fun NavigationView(

) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome" ){
        // also pass navController to each screen so we can use navController in there
        composable("welcome"){ WelcomeScreen(navController)}
        composable("login"){ LoginScreen(navController)}
        composable("signup"){ SignupScreen(navController)}
    }

}