package com.yly.androidhilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      21-1-25 上午10:58
 * @version   1.0
 * @since     1.0
 */
@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {

    @Inject
    internal lateinit var people: People

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
//        println(people)
    }
}