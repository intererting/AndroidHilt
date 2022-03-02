package com.yly.androidhilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * @author    yiliyang
 * @date      21-1-25 上午10:20
 * @version   1.0
 * @since     1.0
 */
@Module
@InstallIn(ActivityComponent::class)
abstract class InterfaceBindsModule {
    /**
     * @Binds实现接口绑定
     */
    @Binds
    abstract fun bindMyInterface(
        myInterface: MyInterfaceImpl
    ): MyInterface
}