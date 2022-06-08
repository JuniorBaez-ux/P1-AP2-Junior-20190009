package com.example.p1_ap2_junior_20190009.di

import android.content.Context
import androidx.room.Room
import com.example.p1_ap2_junior_20190009.data.PrestamosDao
import com.example.p1_ap2_junior_20190009.data.PrestamosDb
import com.example.p1_ap2_junior_20190009.data.repository.PrestamosRepository
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
    fun ProvideTicketDb(@ApplicationContext context: Context): PrestamosDb {
        val DATABASE_NAME = "PrestamoDb"
        return Room.databaseBuilder(
            context,
            PrestamosDb::class.java,
            DATABASE_NAME       )
            .fallbackToDestructiveMigration()
            .build()
    }


    @Provides
    fun ProvideParcial1Ap2DAO(prestamosDb: PrestamosDb): PrestamosDao {
        return prestamosDb.prestamosDao
    }

    @Provides
    fun ProvideParcial1Ap2Repository(prestamosDao: PrestamosDao): PrestamosRepository {
        return PrestamosRepository(prestamosDao)
    }
}
