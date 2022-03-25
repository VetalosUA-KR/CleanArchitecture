package com.vitalii.cleanarchitecturedagger.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.vitalii.cleanarchitecturedagger.ExampleApp
import com.vitalii.cleanarchitecturedagger.R
import com.vitalii.cleanarchitecturedagger.data.database.ExampleDatabase
import com.vitalii.cleanarchitecturedagger.data.network.ExampleApiService
import com.vitalii.cleanarchitecturedagger.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    private val TAG = "MainActivity22"

    @Inject
    lateinit var viewModeFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModeFactory)[ExampleViewModel::class.java]
    }

    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModeFactory)[ExampleViewModel2::class.java]
    }

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory()
            .create("MY_ID_2", "NAME_2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
        viewModel2.method()



    }
}