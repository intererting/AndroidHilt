package com.yly.androidhilt

import javax.inject.Inject

data class SingleTonValue(var value: String) {

    @Inject
    constructor() : this("") {

    }
}