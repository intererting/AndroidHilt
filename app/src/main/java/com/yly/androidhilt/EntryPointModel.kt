package com.yly.androidhilt

import javax.inject.Inject
import javax.inject.Singleton

//这里有用
//@Singleton
class EntryPointModel(var value: String) {

    @Inject
    constructor() : this("entrypoint model")
}