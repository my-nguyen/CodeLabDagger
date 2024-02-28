package com.nguyen.codelabdagger.di

import android.content.Context
import com.nguyen.codelabdagger.main.MainActivity
import com.nguyen.codelabdagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: RegistrationActivity)
    fun inject(activity: MainActivity)
}