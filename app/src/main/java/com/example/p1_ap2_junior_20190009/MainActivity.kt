package com.example.p1_ap2_junior_20190009

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.p1_ap2_junior_20190009.ui.Prestamo.ConsultaPrestamosScreen
import com.example.p1_ap2_junior_20190009.ui.Prestamo.RegistroPrestamoScreen
import com.example.p1_ap2_junior_20190009.ui.theme.RegistroPrestamosComposeTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegistroPrestamosComposeTheme() {
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

    NavHost(navController = navHostController, startDestination = "ConsultaPrestamos"){
        composable("ConsultaPrestamos"){
            ConsultaPrestamosScreen(navHostController = navHostController)
        }
        composable("RegistroPrestamos"){
            RegistroPrestamoScreen(navHostController = navHostController)
        }
    }
}

@Composable
fun RowPrestamos(nombre:String, monto:Double, concepto:String){
        Column() {
            Text(text = " $nombre")
            Text(text = " $concepto")
        }
        Text(text = "$$monto")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    RegistroPrestamosComposeTheme() {
        MyApp()
    }
}