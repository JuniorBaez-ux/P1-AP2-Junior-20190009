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

/*
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}*/

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





/*@Composable
fun OcupacionesSpinner(ocupacion:List<String>){

    var ocupacionText by remember{
        mutableStateOf("")
    }
    var expended by remember{
        mutableStateOf(false)
    }
    Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Row(Modifier
            .fillMaxWidth()
            .clickable {
                expended = !expended
            }
            .padding(8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){

            Text(text = ocupacionText, fontSize = 18.sp, modifier = Modifier.padding(end = 8.dp))
            Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = "")
            DropdownMenu(expanded = expended, onDismissRequest = { expended = false}) {
                ocupacion.forEach {
                        ocupacion -> DropdownMenuItem(onClick = {

                    expended = false
                    ocupacionText = ocupacion.toString()
                    selectedOcupacion = ocupacion
                }) {
                    Text(text = ocupacion.toString())
                }
                }

            }
        }
    }
}


@Composable
fun RowPersona(nombre:String){
    Row() {
        Text(text = "El nombre es: $nombre")
    }
}

@Composable
fun RowOcupacion(ocupacion:String){
    Row() {
        Text(text = "El nombre de la Ocupación es: $ocupacion")
    }
}*/

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    RegistroParcial1Ap2ComposeTheme() {
        MyApp()
    }
}