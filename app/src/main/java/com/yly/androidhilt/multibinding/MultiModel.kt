package com.yly.androidhilt.multibinding

import javax.inject.Inject

/**
 * @author    yiliyang
 * @date      2022/3/2 下午2:23
 * @version   1.0
 * @since     1.0
 *
 * MultiBinding的子Component会继承
 *
 */
class MultiModel @Inject constructor(
    sets: Set<String>,
    maps: Map<String, String>,
    mapClass: MutableMap<Class<*>, String>,
    mapEnum: Map<MapKeys, String>,
//    mapMulti: Map<MultiValueKey, String>
) {

    init {
        sets.forEach {
            println(it)
        }
        maps.forEach {
            println("map ${it.key}")
            println("map ${it.value}")
        }
        mapClass.forEach {
            println("map ${it.key}")
            println("map ${it.value}")
        }
        mapEnum.forEach {
            println("map ${it.key}")
            println("map ${it.value}")
        }
//        mapMulti.forEach {
//            println("map ${it.key}")
//            println("map ${it.value}")
//        }
    }
}