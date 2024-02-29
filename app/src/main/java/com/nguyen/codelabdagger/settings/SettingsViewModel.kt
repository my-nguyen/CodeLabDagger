package com.nguyen.codelabdagger.settings

import com.nguyen.codelabdagger.user.UserDataRepository
import com.nguyen.codelabdagger.user.UserManager
import javax.inject.Inject

/**
 * SettingsViewModel is the ViewModel that [SettingsActivity] uses to handle complex logic.
 */
class SettingsViewModel @Inject constructor(
    private val userDataRepository: UserDataRepository,
    private val userManager: UserManager
) {

    fun refreshNotifications() {
        userDataRepository.refreshUnreadNotifications()
    }

    fun logout() {
        userManager.logout()
    }
}
