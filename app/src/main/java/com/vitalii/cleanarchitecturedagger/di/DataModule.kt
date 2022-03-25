package com.vitalii.cleanarchitecturedagger.di

import android.content.Context
import com.vitalii.cleanarchitecturedagger.data.database.ExampleDatabase
import com.vitalii.cleanarchitecturedagger.data.datasource.*
import com.vitalii.cleanarchitecturedagger.data.network.ExampleApiService
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class DataModule() {


    /**
     * Оба способа работают.
     *
     * В первом случае как аргумент provide-метода мы принимаем
     * готовую реализацию интерфейса, в конструкторе которой есть аннотация @inject
     * и объект необходимый для создания этой реализации тоже имеет анотацию в конструкторе.
     *
     * Во втором случае как аргумент provide-метода мы принимаем объект необходимый для создания
     * реализации этого интерфейса, и уже в provide-методе создаем необходимую реализацию интерфейса.
     *
     */

    @ApplicationScope
    @Provides
    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @ProdQualifier
    @ApplicationScope
    @Provides
    fun provideRemoteDataSource(apiService: ExampleApiService): ExampleRemoteDataSource {
        return ExampleRemoteDataSourceImpl(apiService)
    }

    @TestQualifier
    @ApplicationScope
    @Provides
    fun provideTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }



    /**
     * В случае если dagger должен предоставлять реализацию интерфейсас, то bind-метод предпочтительнее
     * так как dagger не вызывает метод bindLocalDataSource, и если все методы в модуле помечены как bind,
     * dagger даже не создаст этот module. Этот способ уменьшает кол-во генерируемого кода, и уменьшает время сборки
     */
    //@Binds
    //abstract fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

}