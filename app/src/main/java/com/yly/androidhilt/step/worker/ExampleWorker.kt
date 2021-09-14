package com.yly.androidhilt.step.worker

import android.content.Context
import androidx.annotation.NonNull
import androidx.hilt.work.HiltWorker
import androidx.work.Worker
import androidx.work.WorkerParameters

/**
 * @author    yiliyang
 * @date      2021/9/14 下午2:03
 * @version   1.0
 * @since     1.0
 */
@HiltWorker
class ExampleWorker(
    context: Context, workerParams: WorkerParameters
) : Worker(context, workerParams) {
    override fun doWork(): Result {
        println("doWork")
        return Result.success()
    }
}