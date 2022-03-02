package com.yly.androidhilt.multibinding

import androidx.appcompat.app.AppCompatActivity
import com.yly.androidhilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2022/3/2 下午2:24
 * @version   1.0
 * @since     1.0
 */
@AndroidEntryPoint
class MultiBindingActivity : AppCompatActivity(R.layout.activity_multibinding) {

    @Inject
    lateinit var multiModel: MultiModel
}