package com.yly.androidhilt.step.model

import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2021/9/14 上午11:20
 * @version   1.0
 * @since     1.0
 */
class NestedModel @Inject constructor(private val childModel: ChildModel) {

    fun test() {
        childModel.test()
    }
}