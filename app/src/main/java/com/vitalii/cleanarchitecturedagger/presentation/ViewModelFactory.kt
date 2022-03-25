package com.vitalii.cleanarchitecturedagger.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vitalii.cleanarchitecturedagger.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Provider

//Для того чтобы dagger мог возвращать параметризованную коллекцию,
//добавляем аннотацию @JvmSuppressWildcards
class ViewModelFactory @Inject constructor(
    private val viewModelsProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModelsProviders[modelClass]?.get() as T
    }
}