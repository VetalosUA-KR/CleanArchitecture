package com.vitalii.cleanarchitecturedagger.data.datasource

import android.util.Log
import com.vitalii.cleanarchitecturedagger.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl (
    private val apiService: ExampleApiService
): ExampleRemoteDataSource {
    override fun method() {
        Log.i("ExampleRemoteDataSourceImpl", "prod ")
        apiService.method()
    }
}