package com.yly.androidhilt

import androidx.lifecycle.SavedStateHandle
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.components.ViewModelComponent

/**
 * @author    yiliyang
 * @date      21-1-25 上午10:45
 * @version   1.0
 * @since     1.0
 */
@Module
@InstallIn(ActivityRetainedComponent::class)
//@InstallIn(ViewModelComponent::class)
object ViewModelModule {

//    @Provides
//    fun providePeople(handle: SavedStateHandle): ViewModelPeople {
//
//        return ViewModelPeople(handle = handle, name = "ViewModelModule in  ViewModelComponent")
//    }

    @Provides
    fun provideViewModelPeople(): ViewModelPeople {

        return ViewModelPeople(name = "ActivityRetainedComponent")
    }
}