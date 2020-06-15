package com.yly.androidhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

/*ApplicationComponent	Application
ActivityRetainedComponent	ViewModel (see View model extension)
ActivityComponent	Activity
FragmentComponent	Fragment
ViewComponent	View
ViewWithFragmentComponent	View with @WithFragmentBindings
ServiceComponent	Service*/


/*
Component	Scope	Created at	Destroyed at
ApplicationComponent	@Singleton	Application#onCreate()	Application#onDestroy()
ActivityRetainedComponent	@ActivityRetainedScope	Activity#onCreate()1	Activity#onDestroy()1
ActivityComponent	@ActivityScoped	Activity#onCreate()	Activity#onDestroy()
FragmentComponent	@FragmentScoped	Fragment#onAttach()	Fragment#onDestroy()
ViewComponent	@ViewScoped	View#super()	View destroyed
ViewWithFragmentComponent	@ViewScoped	View#super()	View destroyed
ServiceComponent	@ServiceScoped	Service#onCreate()	Service#onDestroy()
*/


//@Module
//@InstallIn(ApplicationComponent::class) // Installs FooModule in the generate ApplicationComponent.
//object ApplicationModule {
//
//    @Provides
//    fun providePeople(): People {
//        return People().apply { name = "provide by module" }
//    }
//}