package com.example.p1_ap2_junior_20190009.ui.Prestamo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.p1_ap2_junior_20190009.data.repository.PrestamosRepository
import com.example.p1_ap2_junior_20190009.model.Prestamos
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

//TODO Implementar view model de la clase correspondiente

@HiltViewModel
class PrestamoViewModel @Inject constructor(
    val prestamosRepository: PrestamosRepository
): ViewModel() {

    var prestamos = prestamosRepository.GetLista()

    var prestamoId by mutableStateOf(0)
    var deudor by mutableStateOf("")
    var concepto by mutableStateOf("")
    var monto by mutableStateOf("")

    fun Guardar(){
        viewModelScope.launch {
            prestamosRepository.Insertar(
                Prestamos(
                    prestamoId = prestamoId,
                    deudor = deudor,
                    concepto = concepto,
                    monto = monto.toDouble()
                )
            )
        }
    }
}
