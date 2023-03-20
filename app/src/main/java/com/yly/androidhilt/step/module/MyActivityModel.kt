package com.yly.androidhilt.step.module

import com.yly.androidhilt.step.MyQualifier
import com.yly.androidhilt.step.model.ChildModel
import com.yly.androidhilt.step.model.OtherModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

/**
 * @author    yiliyang
 * @date      2023/3/15 下午2:48
 * @version   1.0
 * @since     1.0
 */
@Module
@InstallIn(SingletonComponent::class)
object MyActivityModel {

    @Provides
    @MyQualifier
    fun provideName(): OtherModel {
        return OtherModel()
    }

//    @Provides
//    fun provideChildModel(): ChildModel {
//        return ChildModel()
//    }
}