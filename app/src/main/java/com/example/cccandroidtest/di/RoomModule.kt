package com.example.cccandroidtest.di

import android.content.Context
import androidx.room.Room
import com.example.cccandroidtest.data.db.dao.EstimateDao
import com.example.cccandroidtest.data.db.dao.PersonDao
import com.example.cccandroidtest.data.db.database.SampleDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext

/**
 *Author Parvinder Singh
 **/
@Module
@InstallIn(ApplicationComponent::class)
object RoomModule {

    @Provides
    fun provideSampleDatabase(@ApplicationContext context: Context): SampleDatabase{
        return Room.databaseBuilder(context,
        SampleDatabase::class.java,
        "sample_database")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideEstimateDao(sampleDatabase: SampleDatabase): EstimateDao{
        return sampleDatabase.estimateDao()
    }

    @Provides
    fun providePersonDao(sampleDatabase: SampleDatabase): PersonDao{
        return sampleDatabase.personDao()
    }

}