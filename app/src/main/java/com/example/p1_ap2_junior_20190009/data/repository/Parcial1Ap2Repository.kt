package com.example.p1_ap2_junior_20190009.data.repository

import com.example.p1_ap2_junior_20190009.data.PrestamosDao
import com.example.p1_ap2_junior_20190009.model.Prestamos
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Parcial1Ap2Repository @Inject constructor(
    val prestamosDao: PrestamosDao
) {
    suspend fun Insertar(prestamos: Prestamos)= prestamosDao.Insertar(prestamos)

    fun Buscar(prestamos: Int): Flow<Prestamos>   =  prestamosDao.Buscar(prestamos)

    suspend fun Eliminar(prestamos: Prestamos)= prestamosDao.Eliminar(prestamos)

    fun GetLista(): Flow<List<Prestamos>> = prestamosDao.GetLista()
}
