package com.yly.androidhilt

import android.app.Activity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton


/**
 * 这个和ApplicationComponent不一样，这个的生命周期只在Activity中有效
 */
@Module
@InstallIn(ActivityComponent::class)
object ActivivityModule {

    @Provides
    //声明ActivityScoped可以让生成的为Activity范围的单例
    @ActivityScoped
    fun providePeople(): People {

        return People().apply {
            name = "provide by activity moduld"
        }
    }

//    @Provides
//    @BoyQualifier
//    fun provideBoyPeople(): People {
//
//        return People().apply {
//            name = "boy people provide by activity moduld"
//        }
//    }
//
//    @Provides
//    @GirlQualifier
//    fun provideGirlPeople(): People {
//
//        return People().apply {
//            name = "girl people provide by activity moduld"
//        }
//    }
}