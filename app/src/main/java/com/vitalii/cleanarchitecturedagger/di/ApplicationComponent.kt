package com.vitalii.cleanarchitecturedagger.di

import android.content.Context
import com.vitalii.cleanarchitecturedagger.data.database.ExampleDatabase
import com.vitalii.cleanarchitecturedagger.data.network.ExampleApiService
import com.vitalii.cleanarchitecturedagger.presentation.ExampleViewModel
import com.vitalii.cleanarchitecturedagger.presentation.MainActivity
import com.vitalii.cleanarchitecturedagger.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    //Метод с помощью которого мы получаем доступ к саб-компоненту
    fun activityComponentFactory(): ActivityComponent.Factory

    /*@Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun timeMillis(time: Long): ApplicationComponentBuilder

        fun build() : ApplicationComponent

    }*/

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ) : ApplicationComponent
    }

}