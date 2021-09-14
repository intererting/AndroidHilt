package com.yly.androidhilt.step.module

import android.view.View
import androidx.fragment.app.Fragment
import com.yly.androidhilt.step.ModelInViewWithFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewWithFragmentComponent

/**
 * @author    yiliyang
 * @date      2021/9/14 上午9:43
 * @version   1.0
 * @since     1.0
 *
 *
Component	Default Bindings
SingletonComponent	Application2
ActivityRetainedComponent	Application
ViewModelComponent	SavedStateHandle
ActivityComponent	Application, Activity
FragmentComponent	Application, Activity, Fragment
ViewComponent	Application, Activity, View
ViewWithFragmentComponent	Application, Activity, Fragment, View
ServiceComponent	Application, Service
 */
@Module
//只能在Fragment的View中使用
@InstallIn(ViewWithFragmentComponent::class)
object ViewFragmentModule {

    @Provides
    //这里的Fragment和View是默认的，见注释，但是不能用具体的类型
    fun provideModelInViewWithFragment(fragment: Fragment, view: View): ModelInViewWithFragment {
//        println("default fragment ${fragment.hashCode()}")
//        println("default view ${view.hashCode()}")
        return ModelInViewWithFragment()
    }
}