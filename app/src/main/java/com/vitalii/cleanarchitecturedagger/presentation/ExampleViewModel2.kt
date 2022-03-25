package com.vitalii.cleanarchitecturedagger.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.vitalii.cleanarchitecturedagger.domain.ExampleRepository
import com.vitalii.cleanarchitecturedagger.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
): ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel", "$this")
    }

}