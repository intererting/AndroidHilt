package com.yly.androidhilt.step.model

import com.yly.androidhilt.step.MyQualifier
import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2021/9/14 上午11:09
 * @version   1.0
 * @since     1.0
 */
open class ParentModel {

    @Inject
    @MyQualifier
    lateinit var name: OtherModel
}