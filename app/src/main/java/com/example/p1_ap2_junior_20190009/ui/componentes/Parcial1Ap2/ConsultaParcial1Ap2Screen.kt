package com.example.p1_ap2_junior_20190009.ui.componentes.Parcial1Ap2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController


//TODO Realizar ventana de la consulta de la clase correspondiente

@Composable
fun ConsultaParcial1Ap2Screen(
    navHostController: NavHostController,
    parcial1Ap2ViewModel: Parcial1Ap2ViewModel = hiltViewModel()
){

    val ScaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Consulta del primer parcial")}
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navHostController.navigate("RegistroParcial1Ap2")
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        },
        scaffoldState = ScaffoldState

    ) {
        Column(modifier = Modifier
            .padding(it)
            .padding(8.dp)) {
            //val listaclientes = clienteViewModel.clientes.collectAsState(initial = emptyList())

          /*  LazyColumn(modifier = Modifier.fillMaxWidth()){
                items(listaclientes.value){
                        nombre -> RowPersona(nombre = nombre.nombre)
                }
            }*/
        }
    }

}
