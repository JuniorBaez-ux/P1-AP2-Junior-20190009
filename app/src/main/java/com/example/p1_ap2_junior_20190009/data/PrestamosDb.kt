package com.example.p1_ap2_junior_20190009.data


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.p1_ap2_junior_20190009.model.Prestamos

@Database(
    entities = [Prestamos::class],
    version = 1
)
abstract class PrestamosDb: RoomDatabase() {
    abstract  val prestamosDao: PrestamosDao

}
