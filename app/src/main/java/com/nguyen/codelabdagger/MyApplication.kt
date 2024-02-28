package com.nguyen.codelabdagger

import android.app.Application
import com.nguyen.codelabdagger.storage.SharedPreferencesStorage
import com.nguyen.codelabdagger.user.UserManager

open class MyApplication : Application() {

    open val userManager by lazy {
        UserManager(SharedPreferencesStorage(this))
    }
}
