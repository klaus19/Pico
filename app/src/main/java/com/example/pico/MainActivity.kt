package com.example.pico

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pico.ui.theme.PicoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val error:HttpError = HttpError.notFound

        when (error) {
            HttpError.notFound -> Unit
        //    HttpError.UnAuthorized -> Unit
        }

        val errorEnum:HttpErrorEnum = HttpErrorEnum.notFound
        HttpErrorEnum.values()

        when (errorEnum) {
            HttpErrorEnum.notFound-> TODO()
           // HttpErrorEnum.unAuthorized -> TODO()
        }



            }
        }



