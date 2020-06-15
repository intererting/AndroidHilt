package com.yly.androidhilt

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@Module
@InstallIn(FragmentComponent::class)
object FragmentModel {

    /**
     * 在这里也可以限制Scope
     */
    @FragmentScoped
    fun provideScopedPerson(): ScopedPerson {
        return ScopedPerson()
    }
}