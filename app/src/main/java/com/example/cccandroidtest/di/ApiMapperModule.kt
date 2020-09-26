package com.example.cccandroidtest.di

import com.example.cccandroidtest.data.api.mapper.ApiMapper
import com.example.cccandroidtest.data.api.mapper.ApiMapperImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 *Author Parvinder Singh
 **/

@Module
@InstallIn(ApplicationComponent::class)
abstract class ApiMapperModule {

    @Binds
    abstract fun bindApiMapper(apiMapperImpl: ApiMapperImpl): ApiMapper
}