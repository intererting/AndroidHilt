package com.yly.androidhilt.step

import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent

/**
 * @author    yiliyang
 * @date      2021/9/14 下午1:24
 * @version   1.0
 * @since     1.0
 */
@DefineComponent(parent = SingletonComponent::class)
interface CstmComponent {
}