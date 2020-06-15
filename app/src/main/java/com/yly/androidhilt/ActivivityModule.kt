package com.yly.androidhilt

import android.app.Activity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject


/**
 * 这个和ApplicationComponent不一样，这个的生命周期只在Activity中有效
 */
@Module
@InstallIn(ActivityComponent::class)
object ActivivityModule {

    @Provides
    fun providePeople(): People {

        return People().apply {
            name = "provide by activity moduld"
        }
    }
}