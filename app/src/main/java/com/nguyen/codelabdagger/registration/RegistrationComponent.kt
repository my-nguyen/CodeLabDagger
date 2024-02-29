package com.nguyen.codelabdagger.registration

import com.nguyen.codelabdagger.di.ActivityScope
import com.nguyen.codelabdagger.registration.enterdetails.EnterDetailsFragment
import com.nguyen.codelabdagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

@Subcomponent
@ActivityScope
interface RegistrationComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}