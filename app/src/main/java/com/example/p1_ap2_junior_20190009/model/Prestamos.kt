package com.example.p1_ap2_junior_20190009.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "Prestamos")
@Parcelize
data class Prestamos(
    @PrimaryKey(autoGenerate = true)
    val prestamoId: Int,
    val deudor: String,
    val concepto: String,
    val monto: Double
): Parcelable
