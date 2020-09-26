package com.example.cccandroidtest.di

import com.example.cccandroidtest.repository.PersonRepo
import com.example.cccandroidtest.repository.PersonRepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 *Author Parvinder Singh
 **/

@Module
@InstallIn(ApplicationComponent::class)
abstract class PersonRepoModule{

    @Binds
    abstract fun bindPersonRepo(personRepoImpl: PersonRepoImpl): PersonRepo
}