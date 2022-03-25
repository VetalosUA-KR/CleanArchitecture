package com.vitalii.cleanarchitecturedagger.data.database

import android.content.Context
import android.util.Log
import com.vitalii.cleanarchitecturedagger.R
import com.vitalii.cleanarchitecturedagger.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timeMillis: Long
    ) {

    fun method() {
        Log.d(TAG, "ExampleDatabase ${context.getString(R.string.app_name)}, time: [$timeMillis]  $this")
    }

    companion object {
        private const val TAG = "ExampleTest"
    }

}