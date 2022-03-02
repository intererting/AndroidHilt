package com.yly.androidhilt.step

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.yly.androidhilt.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.step_fragment.*
import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2021/9/14 上午10:05
 * @version   1.0
 * @since     1.0
 */
@AndroidEntryPoint
class MyFragment : Fragment(R.layout.step_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        myView.modelInViewWithFragment.test()
    }
}