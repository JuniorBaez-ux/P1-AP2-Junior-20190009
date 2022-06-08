package com.example.p1_ap2_junior_20190009.ui.componentes.Prestamo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.p1_ap2_junior_20190009.data.repository.Parcial1Ap2Repository
import com.example.p1_ap2_junior_20190009.model.Parcial1Ap2
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

//TODO Implementar view model de la clase correspondiente

@HiltViewModel
class PrestamoViewModel @Inject constructor(
    val parcial1Ap2Repository: Parcial1Ap2Repository
): ViewModel() {

   // var clientes = clienteRepository.GetLista()

    var prestamoId by mutableStateOf(0)
    var deudor by mutableStateOf("")
    var concepto by mutableStateOf("")
    var monto by mutableStateOf("")

    fun Guardar(){
        viewModelScope.launch {
            parcial1Ap2Repository.Insertar(
                Parcial1Ap2(
                    prestamoId = prestamoId,
                    deudor = deudor,
                    concepto = concepto,
                    monto = monto.toDouble()
                )
            )
        }
    }
}
