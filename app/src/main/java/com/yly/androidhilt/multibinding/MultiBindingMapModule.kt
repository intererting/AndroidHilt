package com.yly.androidhilt.multibinding

import dagger.MapKey
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.multibindings.*
import java.util.*
import javax.inject.Provider
import javax.inject.Qualifier


/**
 * @author    yiliyang
 * @date      2022/3/2 下午2:20
 * @version   1.0
 * @since     1.0
 */
@Module
@InstallIn(ActivityComponent::class)
object MultiBindingMapModule {

    @Provides
    @IntoMap
    @StringKey("name")
    fun provideOneString(): String {
        return "yuliyang"
    }

    @Provides
    @IntoMap
    @ClassKey(String::class)
    fun provideTwoString(): String {
        return "wahaha"
    }

    @Provides
    @IntoMap
    @MyMapNameKey(MapKeys.NAME)
    fun provide3rdString(): String {
        return "xianren"
    }

    @Provides
    @IntoMap
    @StringKey("age")
    fun provideProviderString(@MyQualifer provider: Provider<String>): String {
        return provider.get()
    }

//    @Provides
//    @IntoMap
//    @MultiValueKey(name = "yuliyang", other = [1, 2, 3])
//    fun providefourString(): String {
//        return "shenxian"
//    }

    @MyQualifer
    @Provides
    fun provideString(): String {
        return "provider string"
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MyQualifer {

}

enum class MapKeys {
    NAME
}

@MapKey
@Retention(AnnotationRetention.BINARY)
annotation class MyMapNameKey(val value: MapKeys) {
}

//@MapKey(unwrapValue = false)
//annotation class MultiValueKey(val name: String, val other: IntArray)
