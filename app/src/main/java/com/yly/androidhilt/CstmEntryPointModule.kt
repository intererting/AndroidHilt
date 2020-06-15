package com.yly.androidhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

//@Module
//@InstallIn(ApplicationComponent::class)
//object CstmEntryPointModule {

    //这样虽然也可以创建第三方库中的MOdel，但是不推荐
//    @Provides
//    fun provideEntryPoint(): EntryPointModel {
//        return EntryPointModel("my entrypoint model")
//    }
//}

//@EntryPoint
//@InstallIn(ApplicationComponent::class)
//interface EntryPointInterface {
//    fun getEntryPoint(): EntryPointModel
//}