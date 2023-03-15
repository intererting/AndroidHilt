package com.yly.androidhilt.step

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.yly.androidhilt.R
import com.yly.androidhilt.databinding.ActivityStepBinding
import com.yly.androidhilt.step.model.*
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2021/9/14 上午9:59
 * @version   1.0
 * @since     1.0
 */
@AndroidEntryPoint
class StepActivity : AppCompatActivity(R.layout.activity_step) {

    private lateinit var myBinding: ActivityStepBinding

    private val myViewModel by viewModels<MyViewModel>()

//    @Inject
//    lateinit var nestedModel: NestedModel

    //Hilt不支持多态，只能用具体类型
//    @Inject
//    lateinit var childModel: ParentModel

//    @Inject
//    lateinit var childModel: ChildModel

    //component不对
//    @Inject
//    lateinit var modelInView: ModelInView

//    @Inject
//    lateinit var cstmComponentModule: CstmComponentModule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myBinding = ActivityStepBinding.inflate(layoutInflater)
        setContentView(myBinding.root)
        supportFragmentManager.beginTransaction().add(R.id.stepFragment, MyFragment()).commit()

//        myView.modelInView.test()

//        modelInView.test()

//        childModel.test()

//        nestedModel.test()

//        EntryPointModel.getModel(this)

//        cstmComponentModule.getModel().test()

        myBinding.save.setOnClickListener {
            myViewModel.save()
        }
        myBinding.get.setOnClickListener {
            myViewModel.get()
        }
    }
}