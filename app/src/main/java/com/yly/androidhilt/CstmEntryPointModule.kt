package com.yly.androidhilt

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

//@Module
//@InstallIn(ApplicationComponent::class)
//object CstmEntryPointModule {
//
//    这样虽然也可以创建第三方库中的Model，但是不推荐
//    @Provides
//    fun provideEntryPoint(): EntryPointModel {
//        return EntryPointModel("my entrypoint model")
//    }
//}

/**
 * 自定义EntryPoint就是实现了Daggeer2 Component里面的注入接口
 */
@EntryPoint
@InstallIn(SingletonComponent::class)
interface EntryPointInterface {
    fun getEntryPoint(): EntryPointModel
}