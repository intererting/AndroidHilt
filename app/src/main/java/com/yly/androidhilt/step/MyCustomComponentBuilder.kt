package com.yly.androidhilt.step

import com.yly.androidhilt.step.model.CstmComponentModel
import dagger.BindsInstance
import dagger.hilt.DefineComponent

/**
 * @author    yiliyang
 * @date      2021/9/14 下午1:32
 * @version   1.0
 * @since     1.0
 */
@DefineComponent.Builder
interface MyCustomComponentBuilder {
    fun fooSeedData(@BindsInstance cstmComponentModel: CstmComponentModel): MyCustomComponentBuilder
    fun build(): CstmComponent
}