package com.yly.androidhilt.step

import com.yly.androidhilt.step.model.ChildModel
import com.yly.androidhilt.step.model.CstmComponentModel
import com.yly.androidhilt.step.model.ReturnModel
import dagger.Module
import dagger.Provides
import dagger.hilt.EntryPoint
import dagger.hilt.EntryPoints
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2021/9/14 下午1:33
 * @version   1.0
 * @since     1.0
 */
class CstmComponentModule @Inject constructor(
    private val componentBuilder: MyCustomComponentBuilder
) {

    fun getModel(): ChildModel {
        val cstmComponent: CstmComponent =
            componentBuilder.fooSeedData(CstmComponentModel()).build()
        return EntryPoints.get(cstmComponent, CstmComponentEntryPoint::class.java)
            .provideChildModel()
    }
}

@EntryPoint
@InstallIn(CstmComponent::class)
interface CstmComponentEntryPoint {

    fun provideChildModel(): ChildModel

}

@Module
@InstallIn(CstmComponent::class)
object MyCstmComponentModule {

    @Provides
    fun provideReturnModel(cstmComponentModel: CstmComponentModel): ReturnModel {
        return ReturnModel(cstmComponentModel.name)
    }

}
















