package com.yly.androidhilt

import android.content.Context
import android.util.AttributeSet
import android.view.View
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.WithFragmentBindings
import javax.inject.Inject


//@WithFragmentBindings
//@AndroidEntryPoint
//class MyView(context: Context?, attributeSet: AttributeSet?) :
//    View(context, attributeSet) {
//    // Bindings in ApplicationComponent, ActivityComponent,
//    // FragmentComponent, and ViewComponent
//    @Inject
//    lateinit var scopedPerson: ScopedPerson
//}