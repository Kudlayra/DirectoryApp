package com.example.myapplication.app.app

import android.app.Application
import com.example.myapplication.data.source.local.DirectoryDatabase
import com.example.myapplication.di.AppComponent
import com.example.myapplication.di.AppModule
import com.example.myapplication.di.DaggerAppComponent

class DirectoryApp : Application() {

    val database: DirectoryDatabase by lazy { DirectoryDatabase.getInstance(this) }

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()

    }

}