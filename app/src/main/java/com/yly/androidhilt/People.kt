package com.yly.androidhilt

import javax.inject.Inject

class People(var name: String) {

    //    @Inject
    constructor() : this("haha") {

    }

}