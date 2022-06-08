package com.example.p1_ap2_junior_20190009.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.p1_ap2_junior_20190009.model.Parcial1Ap2

@Database(
    entities = [Parcial1Ap2::class],
    version = 1
)
abstract class Parcial1Ap2Db: RoomDatabase() {
    abstract  val parcial1Ap2Dao: Parcial1Ap2Dao

}
