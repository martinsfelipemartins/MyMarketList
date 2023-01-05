package com.example.mymarketlist.framework.di

import android.app.Application
import org.koin.core.context.GlobalContext.startKoin

class MainApplication : Application() {

  /*  override fun onCreate() {
        super.onCreate()

        startKoin {
            // Log Koin into Android logger

            // Reference Android context
            androidContext(this@MainApplication)
            // Load modules
            modules(myAppModules)
        }

    }*/
}