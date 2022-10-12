package com.example.chatapplication.di

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object FirebaseDependencyInjection {
    @Provides
    @Singleton
    fun provideFirebaseInstance()= FirebaseFirestore.getInstance()

    @Provides
    @Singleton
    fun provideFirebaseAuth()= FirebaseAuth.getInstance()


    @Provides
    @Singleton
    fun provideFirebaseStorage()= FirebaseAuth.getInstance()

}