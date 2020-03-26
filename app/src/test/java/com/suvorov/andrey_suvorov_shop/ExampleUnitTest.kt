package com.suvorov.andrey_suvorov_shop

import org.junit.Test

import org.junit.Assert.*
import kotlin.math.sqrt

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun main() {

      println(message = formatPrice(price = 99.03721, discInProc = 10))
        println(message = formatPrice(price = 99.34578, measure = "кг", discInProc = 10))
        println(message = formatPrice(price = 100.0))
        println(message = formatPrice(price = 100.111111))

    }
}
