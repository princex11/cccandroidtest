package com.example.cccandroidtest.di

import com.example.cccandroidtest.data.db.mapper.DbMapper
import com.example.cccandroidtest.data.db.mapper.DbMapperImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 *Author Parvinder Singh
 **/
@Module
@InstallIn(ApplicationComponent::class)
abstract class DbMapperModule {

    @Binds
    abstract fun bindDbMapper(dbMapperImpl: DbMapperImpl): DbMapper
}