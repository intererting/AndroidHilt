package com.yly.androidhilt

import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      21-1-25 上午10:17
 * @version   1.0
 * @since     1.0
 */
interface MyInterface {
    fun testInterfaceBinds()
}

class MyInterfaceImpl @Inject constructor() : MyInterface {
    override fun testInterfaceBinds() {
        println("MyInterface testInterfaceBinds")
    }
}