package com.example.jetpackcomposeauthui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeauthui.ui.theme.AlegreyaSansFontFamily

@Composable
fun CTextQuestion( text: String

) {

        Text(text,
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = AlegreyaSansFontFamily,
                color = Color.White
            )
        )



    }
