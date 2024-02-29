package com.nguyen.codelabdagger

import android.app.Application
import com.nguyen.codelabdagger.di.AppComponent
import com.nguyen.codelabdagger.di.DaggerAppComponent

open class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
    // val appComponent = DaggerAppComponent.create()
}
