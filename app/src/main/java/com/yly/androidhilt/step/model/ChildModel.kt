package com.yly.androidhilt.step.model

import com.yly.androidhilt.step.MyQualifier
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ViewScoped
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author    yiliyang
 * @date      2021/9/14 上午11:09
 * @version   1.0
 * @since     1.0
 */
//@Singleton
class ChildModel @Inject constructor() : ParentModel() {

//    @Inject
//    @MyQualifier
//    lateinit var nameChild: OtherModel

    fun test() {
        println(hashCode())
//        println("childModel $nameChild $name")
    }
}