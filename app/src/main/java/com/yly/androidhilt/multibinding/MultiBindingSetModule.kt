package com.yly.androidhilt.multibinding

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet
import java.util.*


/**
 * @author    yiliyang
 * @date      2022/3/2 下午2:20
 * @version   1.0
 * @since     1.0
 */
@Module
@InstallIn(ActivityComponent::class)
object MultiBindingSetModule {

    @Provides
    @IntoSet
    fun provideOneString(): String {
        return "FIRST"
    }

    @Provides
    @ElementsIntoSet
    fun provideSomeStrings(): Set<String> {
        return HashSet(Arrays.asList("DEF", "GHI"))
    }
}