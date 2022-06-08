package com.example.p1_ap2_junior_20190009.di

import android.content.Context
import androidx.room.Room
import com.example.p1_ap2_junior_20190009.data.Parcial1Ap2Dao
import com.example.p1_ap2_junior_20190009.data.Parcial1Ap2Db
import com.example.p1_ap2_junior_20190009.data.repository.Parcial1Ap2Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object  AppModule {


    @Singleton
    @Provides
    fun ProvideTicketDb(@ApplicationContext context: Context): Parcial1Ap2Db {
        val DATABASE_NAME = "PrestamoDb"
        return Room.databaseBuilder(
            context,
            Parcial1Ap2Db::class.java,
            DATABASE_NAME       )
            .fallbackToDestructiveMigration()
            .build()
    }


    @Provides
    fun ProvideParcial1Ap2DAO(parcialDb: Parcial1Ap2Db): Parcial1Ap2Dao {
        return parcialDb.parcial1Ap2Dao
    }

    @Provides
    fun ProvideParcial1Ap2Repository(parcial12Dao: Parcial1Ap2Dao): Parcial1Ap2Repository {
        return Parcial1Ap2Repository(parcial12Dao)
    }
}
