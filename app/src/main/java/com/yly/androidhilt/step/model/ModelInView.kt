package com.yly.androidhilt.step

import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2021/9/14 上午9:44
 * @version   1.0
 * @since     1.0
 */
class ModelInView {
    fun test() {
        println("modelInView")
    }
}

class ModelInViewWithFragment {
    fun test() {
        println("ModelInViewWithFragment")
    }
}

class ModelInViewModel @Inject constructor() {
    fun test() {
        println("ModelInViewModel")
    }

    override fun hashCode(): Int {
        return 10
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }
}