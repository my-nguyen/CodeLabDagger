package com.nguyen.codelabdagger.user

import com.nguyen.codelabdagger.main.MainActivity
import com.nguyen.codelabdagger.settings.SettingsActivity
import dagger.Subcomponent

@Subcomponent
@LoggedUserScope
interface UserComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}