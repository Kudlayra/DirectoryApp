package com.example.myapplication.di

import android.content.Context
import com.example.myapplication.data.DirectoryStorage
import com.example.myapplication.data.repository.DirectoryRepositoryImpl
import com.example.myapplication.data.source.DatabaseDirectoryStorage
import com.example.myapplication.data.source.local.DirectoryDatabase
import com.example.myapplication.domain.repository.DirectoryRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideDirectoryDatabase(context: Context): DirectoryDatabase {
        return DirectoryDatabase.getInstance(context = context)
    }

    @Provides
    fun provideDirectoryStorage(database: DirectoryDatabase): DirectoryStorage {
        return DatabaseDirectoryStorage(database = database)
    }

    @Provides
    fun provideDirectoryRepository(directoryStorage: DirectoryStorage): DirectoryRepository {
        return DirectoryRepositoryImpl(directoryStorage = directoryStorage)
    }

}