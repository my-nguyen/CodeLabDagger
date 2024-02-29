package com.nguyen.codelabdagger.settings

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.nguyen.codelabdagger.MyApplication
import com.nguyen.codelabdagger.R
import com.nguyen.codelabdagger.login.LoginActivity
import javax.inject.Inject

class SettingsActivity : AppCompatActivity() {

    @Inject lateinit var settingsViewModel: SettingsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        val userManager = (application as MyApplication).appComponent.userManager()
        userManager.userComponent!!.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        setupViews()
    }

    private fun setupViews() {
        findViewById<Button>(R.id.refresh).setOnClickListener {
            settingsViewModel.refreshNotifications()
        }
        findViewById<Button>(R.id.logout).setOnClickListener {
            settingsViewModel.logout()
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or
                    Intent.FLAG_ACTIVITY_CLEAR_TASK or
                    Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}
