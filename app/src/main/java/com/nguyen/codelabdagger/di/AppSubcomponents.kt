package com.nguyen.codelabdagger.di

import com.nguyen.codelabdagger.login.LoginComponent
import com.nguyen.codelabdagger.registration.RegistrationComponent
import dagger.Module

@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class])
class AppSubcomponents