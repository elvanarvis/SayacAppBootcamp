package com.elvanarvis.sayacappbootcamp

import android.app.Application
import timber.log.Timber

class SayacApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}