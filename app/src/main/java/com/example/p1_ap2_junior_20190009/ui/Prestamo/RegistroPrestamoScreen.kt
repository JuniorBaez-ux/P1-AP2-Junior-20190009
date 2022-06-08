package com.example.p1_ap2_junior_20190009.ui.Prestamo

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
fun RegistroPrestamoScreen(
    navHostController: NavHostController,
    prestamoViewModel: PrestamoViewModel = hiltViewModel()
    ) {


    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Registro de prestamos") }) }
    ){


    Column(modifier = Modifier.padding(8.dp)) {
        OutlinedTextField(
            value = prestamoViewModel.deudor,
            onValueChange = {prestamoViewModel.deudor = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Nombre del Deudor")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null)
            }
        )

        OutlinedTextField(
            value = prestamoViewModel.concepto,
            onValueChange = {prestamoViewModel.concepto = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Concepto")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null)
            }
        )

        OutlinedTextField(

            value = prestamoViewModel.monto,
            onValueChange = {prestamoViewModel.monto = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Monto")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null)
            }
        )

        OutlinedButton(
            onClick = {
                prestamoViewModel.Guardar()
                navHostController.navigateUp()
            }
        ) {
            Text(text = "Guardar")
        }
    }
    }
}
