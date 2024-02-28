package com.nguyen.codelabdagger.di

import com.nguyen.codelabdagger.storage.SharedPreferencesStorage
import com.nguyen.codelabdagger.storage.Storage
import dagger.Binds
import dagger.Module

@Module
abstract class StorageModule {
    @Binds
    abstract fun provideStorage(impl: SharedPreferencesStorage): Storage
}