package com.yly.androidhilt

import javax.inject.Qualifier

/**
 * @author    yiliyang
 * @date      21-1-25 上午10:31
 * @version   1.0
 * @since     1.0
 */
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BoyQualifier()

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class GirlQualifier()