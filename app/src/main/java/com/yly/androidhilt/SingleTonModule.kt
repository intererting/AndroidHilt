package com.yly.androidhilt

import android.app.Activity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object SingleTonModule {

    /**
     * Activity为默认参数
     *
     *
    Component	Default Bindings
    ApplicationComponent	Application
    ActivityRetainedComponent	Application
    ActivityComponent	Application, Activity
    FragmentComponent	Application, Activity, Fragment
    ViewComponent	Application, Activity, View
    ViewWithFragmentComponent	Application, Activity, Fragment, View
    ServiceComponent	Application, Service
     *
     *
     */
    @Provides
    fun provideSingleTonValue(activity: Activity): SingleTonValue {
        return SingleTonValue(activity.localClassName)
    }

//    @Provides
//    @Singleton
//    fun provideSingleTonValue(): SingleTonValue {
//        return SingleTonValue("单例")
//    }


}