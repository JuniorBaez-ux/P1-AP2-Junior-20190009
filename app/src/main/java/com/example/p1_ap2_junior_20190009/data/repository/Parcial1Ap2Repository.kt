package com.example.p1_ap2_junior_20190009.data.repository

import com.example.p1_ap2_junior_20190009.data.Parcial1Ap2Dao
import com.example.p1_ap2_junior_20190009.model.Parcial1Ap2
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Parcial1Ap2Repository @Inject constructor(
    val parcial1Ap2Dao: Parcial1Ap2Dao
) {
    suspend fun Insertar(parcial1ap2: Parcial1Ap2)= parcial1Ap2Dao.Insertar(parcial1ap2)

    fun Buscar(parcial1ap2: Int): Flow<Parcial1Ap2>   =  parcial1Ap2Dao.Buscar(parcial1ap2)

    suspend fun Eliminar(parcial1ap2: Parcial1Ap2)= parcial1Ap2Dao.Eliminar(parcial1ap2)

    fun GetLista(): Flow<List<Parcial1Ap2>> = parcial1Ap2Dao.GetLista()
}
