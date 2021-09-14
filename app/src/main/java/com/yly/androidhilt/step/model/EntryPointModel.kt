package com.yly.androidhilt.step.model

import android.app.Activity
import dagger.Provides
import dagger.hilt.EntryPoint
import dagger.hilt.EntryPoints
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2021/9/14 上午11:37
 * @version   1.0
 * @since     1.0
 */
class EntryPointModel {

    fun getModel(context: Activity) {
        EntryPoints.get(context, MyEntryPoint::class.java).provideChildModel().test()
    }

// 如果EntryPointModel只是一个普通类，没有@Inject或者@Module等，那么就不能使用@Provides,只能使用EntryPoints
//    @Provides
//    fun getModel(): ChildModel {
//        return ChildModel()
//    }

}

@EntryPoint
@InstallIn(ActivityComponent::class)
interface MyEntryPoint {
    fun provideChildModel(): ChildModel
}