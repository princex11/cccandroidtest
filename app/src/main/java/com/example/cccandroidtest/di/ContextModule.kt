package com.example.cccandroidtest.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/**
 *Author Parvinder Singh
 **/
@Module
@InstallIn(ApplicationComponent::class)
object ContextModule {

    @Provides
    fun context(context: Context): Context{
        return context
    }
}