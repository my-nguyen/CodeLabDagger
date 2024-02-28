package com.nguyen.codelabdagger.di

import com.nguyen.codelabdagger.registration.RegistrationActivity
import dagger.Component

@Component
interface AppComponent {
    fun inject(activity: RegistrationActivity)
}