package com.vitalii.cleanarchitecturedagger.data.datasource

import android.util.Log
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor() : ExampleRemoteDataSource {
    override fun method() {
        Log.i("TestRemoteDataSourceImpl", "test")
    }
}