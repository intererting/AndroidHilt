package com.yly.androidhilt

import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject


/**
 * 这个类只能在Fragment中使用，每个Fragment一个实例
 *
 * 而且在同一个对象多次注入，那么注入的是同一个对象，所以对于一个对象来说
 * scope是单例的
 */
@FragmentScoped
class ScopedPerson @Inject constructor() {
}