package com.yly.androidhilt

import android.app.Application
import androidx.hilt.work.HiltWorkerFactory
import androidx.work.Configuration
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication : Application(), Configuration.Provider {

//这个地方注释是为了测试People不使用构造器注入，而使用@Provides注入（ActivivityModule）
//    @Inject
//    lateinit var people: People

//    @Inject
//    lateinit var entryPointModel: EntryPointModel

    override fun onCreate() {
        super.onCreate()
//        println(people.name)
//        println("entryPointModel   ${entryPointModel.value}")
    }

    @Inject
    lateinit var workerFactory: HiltWorkerFactory

    override fun getWorkManagerConfiguration() =
        Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()

}