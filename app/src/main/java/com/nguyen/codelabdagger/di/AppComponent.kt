package com.nguyen.codelabdagger.di

import android.content.Context
import com.nguyen.codelabdagger.login.LoginComponent
import com.nguyen.codelabdagger.main.MainActivity
import com.nguyen.codelabdagger.registration.RegistrationComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun registrationComponent(): RegistrationComponent.Factory
    fun loginComponent(): LoginComponent.Factory

    fun inject(activity: MainActivity)
}