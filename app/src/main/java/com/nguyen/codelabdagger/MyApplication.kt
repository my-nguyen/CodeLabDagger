package com.nguyen.codelabdagger

import android.app.Application
import com.nguyen.codelabdagger.di.AppComponent
import com.nguyen.codelabdagger.di.DaggerAppComponent
import com.nguyen.codelabdagger.storage.SharedPreferencesStorage
import com.nguyen.codelabdagger.user.UserManager

open class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
    // val appComponent = DaggerAppComponent.create()

    open val userManager by lazy {
        UserManager(SharedPreferencesStorage(this))
    }
}
