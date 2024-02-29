package com.nguyen.codelabdagger.login

import com.nguyen.codelabdagger.di.ActivityScope
import dagger.Subcomponent

@Subcomponent
@ActivityScope
interface LoginComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)
}