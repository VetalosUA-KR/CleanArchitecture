package com.vitalii.cleanarchitecturedagger.di

import com.vitalii.cleanarchitecturedagger.data.repository.ExampleRepositoryImpl
import com.vitalii.cleanarchitecturedagger.domain.ExampleRepository
import com.vitalii.cleanarchitecturedagger.domain.ExampleUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    //За счет того что конструктор ExampleRepositoryImpl помечен @inject и объекты необходимые для
    //ExampleRepositoryImpl так же помечены этой аннотацией, даггер знает как создать ExampleRepositoryImpl
    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }

    /*@Provides
    fun provideUseCase(repositoryImpl: ExampleRepositoryImpl): ExampleUseCase {
        return ExampleUseCase(repositoryImpl)
    }*/

}