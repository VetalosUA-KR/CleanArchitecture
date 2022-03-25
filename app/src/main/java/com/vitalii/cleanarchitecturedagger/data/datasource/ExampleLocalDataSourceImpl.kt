package com.vitalii.cleanarchitecturedagger.data.datasource

import com.vitalii.cleanarchitecturedagger.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor (
    private val database: ExampleDatabase
): ExampleLocalDataSource {
    override fun method() {
        database.method()
    }
}