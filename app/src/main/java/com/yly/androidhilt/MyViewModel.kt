package com.yly.androidhilt

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import javax.inject.Inject

//people将自动注入
class MyViewModel @ViewModelInject constructor(
    val people: People,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {


}