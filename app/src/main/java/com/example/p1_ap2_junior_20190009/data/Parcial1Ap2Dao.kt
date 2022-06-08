package com.example.p1_ap2_junior_20190009.data

import androidx.room.*
import com.example.p1_ap2_junior_20190009.model.Parcial1Ap2
import kotlinx.coroutines.flow.Flow


@Dao
interface Parcial1Ap2Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun Insertar(cliente: Parcial1Ap2)

    @Delete
    suspend fun Eliminar(cliente: Parcial1Ap2)


    @Query("""
        SELECT * 
        FROM Parcial1
        WHERE objetoId=:objetoId        
    """)
    fun Buscar(objetoId: Int): Flow<Parcial1Ap2>

    @Query("""
        SELECT * 
        FROM Parcial1
        ORDER BY objetoId    
    """)
    fun GetLista(): Flow<List<Parcial1Ap2>>

}
