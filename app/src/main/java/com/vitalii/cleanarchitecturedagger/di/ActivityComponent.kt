package com.vitalii.cleanarchitecturedagger.di

import com.vitalii.cleanarchitecturedagger.presentation.MainActivity
import com.vitalii.cleanarchitecturedagger.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@Subcomponent(
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface Factory {

        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String
        ):ActivityComponent
    }

}