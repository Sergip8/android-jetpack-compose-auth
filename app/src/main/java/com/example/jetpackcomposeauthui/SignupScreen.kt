package com.example.jetpackcomposeauthui

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposeauthui.components.CButton
import com.example.jetpackcomposeauthui.components.CTextField
import com.example.jetpackcomposeauthui.components.CTextQuestion
import com.example.jetpackcomposeauthui.components.CTextSign
import com.example.jetpackcomposeauthui.components.ErrorList

import com.example.jetpackcomposeauthui.ui.theme.AlegreyaFontFamily
import com.example.jetpackcomposeauthui.ui.theme.AlegreyaSansFontFamily
import com.example.jetpackcomposeauthui.ui.theme.rememberImeState
import com.example.jetpackcomposeauthui.viewmodel.AuthViewModel

@Composable
fun SignupScreen(
    navController: NavHostController,
    authViewModel: AuthViewModel = viewModel()
) {
    val context = LocalContext.current
    val state = authViewModel.state
    val imeState = rememberImeState()
    val scrollState = rememberScrollState(0)

    LaunchedEffect(key1 = imeState.value){
        if(imeState.value){
            scrollState.scrollTo(scrollState.maxValue-110)
        }
    }




        Box(modifier =  Modifier.fillMaxSize()){
            /// Background Image
            Image(painter = painterResource(id = R.drawable.authbg),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.FillBounds,
            )

            /// Content

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp)
                    .verticalScroll(scrollState)
                    .height(IntrinsicSize.Max)
                    .statusBarsPadding()
            ) {

                // Logo
                Text(text = "Consumed",
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontFamily = AlegreyaFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color.White
                    ),
                    modifier = Modifier
                        .padding(top = 50.dp)
                )

                // Logo
                Icon(
                    ImageVector.vectorResource(id = R.drawable.ic_logomed),
                    contentDescription = null,
                    modifier = Modifier
                        .scale(1.5F)
                        .height(60.dp)
                        ,

                    tint = Color(0xFFE4E4E4)

                    //.offset(x = (-20).dp)
                )

                Text(text = "Sign Up",
                    style = TextStyle(
                        fontSize = 32.sp,
                        fontFamily = AlegreyaFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color.White
                    ),
                    modifier = Modifier.align(Alignment.Start)
                )

                Text("Registrate para acceder a nuestros servicios.",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = AlegreyaSansFontFamily,
                        color = colorResource(id = R.color.text_secondary)
                    ),
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(bottom = 24.dp)
                )
                ErrorList(errorList = state.errorList)

                // Text Field
                CTextField(hint = "Nombre", value = state.name, onValueChange = {authViewModel.changeName(it)} )

                CTextField(hint = "Email", value = state.email, onValueChange = {authViewModel.changeEmail(it)} )

                CTextField(hint = "Password", value = state.password, onValueChange = {authViewModel.changePassword(it)})

                CTextField(hint = "Confirmar password", value = state.passwordConfirmation, onValueChange = {authViewModel.changeConfirmPassword(it)})
                Spacer(modifier = Modifier.height(24.dp))

                CButton(text = "Sign Up", onClick = {authViewModel.register(context)})

                Row(
                    modifier = Modifier.padding(top=12.dp, bottom = 52.dp)
                ){
                   CTextQuestion(text = "Ya tienes cuenta?")
                    CTextSign(text = "Entra",
                        onSignupTap = {
                        navController.navigate("login")
                    })



                }

            }

        }


}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun SignupScreenPreview() {
    SignupScreen(rememberNavController())
}