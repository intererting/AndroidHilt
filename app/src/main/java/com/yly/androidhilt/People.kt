package com.yly.androidhilt

import javax.inject.Inject

data class People(var name: String) {

    @Inject
    constructor() : this("haha") {

    }

}