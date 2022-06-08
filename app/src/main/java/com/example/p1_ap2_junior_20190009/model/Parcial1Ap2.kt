package com.example.p1_ap2_junior_20190009.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "Parcial1")
@Parcelize
data class Parcial1Ap2(
    @PrimaryKey(autoGenerate = true)
    val objetoId: Int,

): Parcelable
