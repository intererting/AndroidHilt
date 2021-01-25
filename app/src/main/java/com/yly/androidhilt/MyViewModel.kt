package com.yly.androidhilt

import android.content.Context
import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

//people将自动注入
class MyViewModel @ViewModelInject constructor(
//    @ActivityContext context: Context, //系统自带的两个Qualifier
    @ApplicationContext context: Context,
//    @BoyQualifier val people: People,
    //在ViewModel和WorkManager中使用，通过工厂方法注入对象
    @Assisted
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    init {
//        println("context  $context people  ${people.name}")
    }

}

class MyViewModelComponentViewModel @ViewModelInject constructor(
    var viewModelPeople: ViewModelPeople,
) : ViewModel() {

//    @Inject
//    lateinit var viewModelPeople: ViewModelPeople
}
