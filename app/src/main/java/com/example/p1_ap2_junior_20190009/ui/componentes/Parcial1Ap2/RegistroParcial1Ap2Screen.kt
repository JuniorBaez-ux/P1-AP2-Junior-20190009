package com.example.p1_ap2_junior_20190009.ui.componentes.Parcial1Ap2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

//TODO Realizar ventana del registo de la clase correspondiente
@Composable
fun RegistroParcial1Ap2Screen(
    navHostController: NavHostController,
    parcial1Ap2ViewModel: Parcial1Ap2ViewModel = hiltViewModel()
    ) {

    //val ocup = listOf("Maestro", "Ingeniero", "Doctor", "Carpinterio")

    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Registro del primer parcial") }) }
    ){


    Column(modifier = Modifier.padding(8.dp)) {
       /* OutlinedTextField(
            value = clienteViewModel.nombre,
            onValueChange = {clienteViewModel.nombre = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Nombre de la Persona")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null)
            }
        )

        OutlinedTextField(
            value = clienteViewModel.email,
            onValueChange = {clienteViewModel.email = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Email")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null)
            }
        )

        OcupacionesSpinner(ocupacion = ocup)

        OutlinedTextField(

            value = clienteViewModel.balance,
            onValueChange = {clienteViewModel.balance = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Salario")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null)
            }
        )*/

        OutlinedButton(
            onClick = {
                parcial1Ap2ViewModel.Guardar()
                navHostController.navigateUp()
            }
        ) {
            Text(text = "Guardar")
        }
    }
    }
}
