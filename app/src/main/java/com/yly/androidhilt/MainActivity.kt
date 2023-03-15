package com.yly.androidhilt

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.yly.androidhilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.EntryPointAccessors
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var myBinding: ActivityMainBinding

    @Inject
    lateinit var people: People

    @Inject
    lateinit var peopleB: People
/*

    //带标示符的注入
    @Inject
    @BoyQualifier
    internal lateinit var boyPeople: People
*/

    @Inject
    lateinit var singleTonValue: SingleTonValue

    /**
     * 由于限定了Scope,所以不能在Activity中使用
     */
//    @Inject
//    lateinit var scopedPerson: ScopedPerson

    private val myViewModel by viewModels<MyViewModel>()

    private val viewmodelComponentViewModel by viewModels<MyViewModelComponentViewModel>()

//    @Inject
//    lateinit var viewModelPeople: ViewModelPeople

    @Inject
    internal lateinit var myInterface: MyInterface

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        myBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(myBinding.root)

        myBinding.startSecond.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
//        test.text = people.name

/*

        //带qualifier
        println(boyPeople.name)
*/

        //测试接口注入
        myInterface.testInterfaceBinds()

/*

        //默认不是单例
        println(people)
        println("people === peopleB   ${people === peopleB}")
*/

        supportFragmentManager.beginTransaction().add(R.id.fragment_container, MyFragment())
            .commit()

        supportFragmentManager.beginTransaction().add(R.id.fragment_container_b, MyFragment())
            .commit()

//        println("viewmodelComponentViewModel  ${viewmodelComponentViewModel.viewModelPeople.name}")

//        println("myViewModel.people   ${myViewModel.people.name}")

//        println("singleTonValue   ${singleTonValue.value}")

        //测试自定义EntryPoint
        val entryPointModel1 =
            EntryPointAccessors.fromApplication(applicationContext, EntryPointInterface::class.java)
                .getEntryPoint()

        val entryPointModel2 =
            EntryPointAccessors.fromApplication(applicationContext, EntryPointInterface::class.java)
                .getEntryPoint()
/*
        println("entryPointModel1 $entryPointModel1")
        println("entryPointModel2 $entryPointModel2")
    */
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }
}