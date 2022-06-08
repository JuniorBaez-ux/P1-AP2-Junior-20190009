package com.example.p1_ap2_junior_20190009

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.compose.setContent
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.p1_ap2_junior_20190009.ui.componentes.Parcial1Ap2.ConsultaParcial1Ap2Screen
import com.example.p1_ap2_junior_20190009.ui.componentes.Parcial1Ap2.RegistroParcial1Ap2Screen
import com.example.p1_ap2_junior_20190009.ui.theme.RegistroParcial1Ap2ComposeTheme
import dagger.hilt.android.AndroidEntryPoint

var selectedOcupacion: String? = null

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegistroParcial1Ap2ComposeTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

//TODO Implementar navegacion correspondiente
@Composable
fun MyApp() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = "ConsultaParcial1Ap2"){
        composable("ConsultaParcial1Ap2"){
            ConsultaParcial1Ap2Screen(navHostController = navHostController)
        }
        composable("RegistroParcial1Ap2"){
            RegistroParcial1Ap2Screen(navHostController = navHostController)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    RegistroParcial1Ap2ComposeTheme() {
        MyApp()
    }
}