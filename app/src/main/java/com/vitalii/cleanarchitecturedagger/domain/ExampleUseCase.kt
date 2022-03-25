package com.vitalii.cleanarchitecturedagger.domain

import javax.inject.Inject


class ExampleUseCase @Inject constructor(
    private val repository: ExampleRepository
) {

    operator fun invoke() {
        repository.method()
    }

}