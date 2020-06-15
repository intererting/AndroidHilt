package com.yly.androidhilt

import android.app.Application
import dagger.hilt.EntryPoints
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication : Application() {

    @Inject
    lateinit var people: People

//    @Inject
//    lateinit var entryPointModel: EntryPointModel

    override fun onCreate() {
        super.onCreate()
        println(people.name)
//        println("entryPointModel   ${entryPointModel.value}")
    }
}