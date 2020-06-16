package com.yly.androidhilt

import javax.inject.Inject

data class EntryPointModel(var value: String) {

    @Inject
    constructor() : this("entrypoint model")
}