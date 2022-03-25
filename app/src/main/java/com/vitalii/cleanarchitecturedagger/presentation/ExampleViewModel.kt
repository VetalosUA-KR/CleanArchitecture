package com.vitalii.cleanarchitecturedagger.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.vitalii.cleanarchitecturedagger.di.IdQualifier
import com.vitalii.cleanarchitecturedagger.di.NameQualifier
import com.vitalii.cleanarchitecturedagger.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name:String
): ViewModel() {

    fun method() {
        useCase.invoke()
        Log.d("ExampleViewModel", "$this $id $name")
    }

}