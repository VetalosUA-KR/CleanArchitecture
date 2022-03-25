package com.vitalii.cleanarchitecturedagger

import android.app.Application
import com.vitalii.cleanarchitecturedagger.di.DaggerApplicationComponent

class ExampleApp: Application() {

    public val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}