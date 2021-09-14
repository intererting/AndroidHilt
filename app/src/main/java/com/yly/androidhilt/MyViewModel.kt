package com.yly.androidhilt

import android.content.Context
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.assisted.Assisted
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

//people将自动注入
@HiltViewModel
class MyViewModel @Inject constructor(
//    @ActivityContext context: Context, //系统自带的两个Qualifier
    @ApplicationContext context: Context,
//    @BoyQualifier val people: People,
    //在ViewModel和WorkManager中使用，通过工厂方法注入对象
//    @Assisted
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    init {
//        println("context  $context people  ${people.name}")
    }

}

@HiltViewModel
class MyViewModelComponentViewModel @Inject constructor(
    var viewModelPeople: ViewModelPeople,
) : ViewModel() {

//    @Inject
//    lateinit var viewModelPeople: ViewModelPeople
}
