package com.yly.androidhilt

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var people: People

    @Inject
    lateinit var peopleB: People

    @Inject
    lateinit var singleTonValue: SingleTonValue

    /**
     * 由于限定了Scope,所以不能在Activity中使用
     */
//    @Inject
//    lateinit var scopedPerson: ScopedPerson

    private val myViewModel by viewModels<MyViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test.text = people.name

        println("people === peopleB   ${people === peopleB}")

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, MyFragment())
            .commit()

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_b, MyFragment())
            .commit()

        println("myViewModel.people   ${myViewModel.people.name}")

        println("singleTonValue   ${singleTonValue.value}")
    }
}