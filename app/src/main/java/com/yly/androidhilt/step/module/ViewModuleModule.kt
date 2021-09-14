package com.yly.androidhilt.step.module

import com.yly.androidhilt.step.ModelInViewModel
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * @author    yiliyang
 * @date      2021/9/14 上午10:46
 * @version   1.0
 * @since     1.0
 */
@Module
@InstallIn(ViewModelComponent::class)
object ViewModuleModule {

    @Provides
    //在ViewModel中单例,这个是肯定能保证单例的，但是有性能的损耗
//    @ViewModelScoped
    //这个能尽可能的保证单例
    @Reusable
    fun provideModelInViewModel(): ModelInViewModel {
        return ModelInViewModel()
    }
}