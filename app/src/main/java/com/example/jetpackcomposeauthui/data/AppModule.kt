package com.example.jetpackcomposeauthui.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8000/api/")
            //.client(OkHttpClient.Builder().build())
            .addConverterFactory(MoshiConverterFactory.create().asLenient())
            .build()
    }

}