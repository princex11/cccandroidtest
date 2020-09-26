package com.example.cccandroidtest.di

import android.content.Context
import android.util.Log
import com.example.cccandroidtest.data.api.model.ApiModel
import com.example.cccandroidtest.domain.Model
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
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
object DataModule {

    @Provides
    fun provideMoshi(): Moshi{
        Log.d("app","moshi")
        return Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    @Provides
    fun provideSampleData(moshi: Moshi, @ApplicationContext context: Context): ApiModel?{
        val adapter  = moshi.adapter(ApiModel::class.java)
        val stream = context.assets.open("sample.json")
            .bufferedReader().use { it.readText() }
        return adapter.fromJson(stream)
    }
}