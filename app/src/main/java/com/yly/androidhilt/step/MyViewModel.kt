package com.yly.androidhilt.step

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2021/9/14 上午10:18
 * @version   1.0
 * @since     1.0
 */
@HiltViewModel
class MyViewModel @Inject constructor(
    //自动注入，不用@Assisted
    private val bundle: SavedStateHandle,
    private val modelInViewModel: ModelInViewModel,
    private val modelInViewModel2: ModelInViewModel
) : ViewModel() {

    fun save() {
        bundle.set("name", "yuliyang")
    }

    fun get() {
        println(bundle.get("name"))
        modelInViewModel.test()
//        println(modelInViewModel.hashCode())
        println(System.identityHashCode(modelInViewModel))
        println(System.identityHashCode(modelInViewModel2))
    }
}