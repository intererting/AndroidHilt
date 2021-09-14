package com.yly.androidhilt.step.module

import com.yly.androidhilt.step.ModelInView
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewComponent

/**
 * @author    yiliyang
 * @date      2021/9/14 上午9:43
 * @version   1.0
 * @since     1.0
 */
@Module
//只能在View中使用
@InstallIn(ViewComponent::class)
object ViewModule {

    @Provides
    fun provideModelInView(): ModelInView {
        return ModelInView()
    }
}