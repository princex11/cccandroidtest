package com.example.cccandroidtest.di

import com.example.cccandroidtest.repository.EstimateRepo
import com.example.cccandroidtest.repository.EstimateRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 *Author Parvinder Singh
 **/
@Module
@InstallIn(ApplicationComponent::class)
abstract class EstimateRepoModule {

    @Binds
    abstract fun bindEstimateRepo(estimateRepoImpl: EstimateRepoImpl): EstimateRepo

}