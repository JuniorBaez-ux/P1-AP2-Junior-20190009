package com.example.p1_ap2_junior_20190009.data

import androidx.room.*
import com.example.p1_ap2_junior_20190009.model.Prestamos
import kotlinx.coroutines.flow.Flow


@Dao
interface PrestamosDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun Insertar(prestamo: Prestamos)

    @Delete
    suspend fun Eliminar(prestamo: Prestamos)


    @Query(
        """
        SELECT * 
        FROM Prestamos
        WHERE prestamoId=:prestamoId        
    """
    )
    fun Buscar(prestamoId: Int): Flow<Prestamos>

    @Query(
        """
        SELECT * 
        FROM Prestamos
        ORDER BY prestamoId    
    """
    )
    fun GetLista(): Flow<List<Prestamos>>

}
