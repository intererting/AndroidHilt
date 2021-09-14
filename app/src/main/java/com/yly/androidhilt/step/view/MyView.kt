package com.yly.androidhilt.step.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.yly.androidhilt.step.ModelInView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2021/9/14 上午9:58
 * @version   1.0
 * @since     1.0
 */
@AndroidEntryPoint
class MyView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    @Inject
    lateinit var modelInView: ModelInView
}