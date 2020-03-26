package com.suvorov.andrey_suvorov_shop


import org.junit.Test

import org.junit.Assert.*
import kotlin.math.sqrt

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
fun editFormatPrice(price:Double):String{
    when {
        price % 1.0 != 0.0 -> {
            return (Math.rint(100.0 * price) / 100.0).toString()
        }
        else -> {
            return Math.round(price).toString()
        }
    }
}

fun formatPrice(price: Double, measure: String = "шт", discInProc: Int = 0): String{
    when{
        discInProc != 0 -> {
            val newPrice: Double = price - (price * discInProc / 100)
            val editPrice: String = editFormatPrice(newPrice)
            return "$editPrice/$measure (скидка $discInProc%)"
        }
        else -> {
            return "${editFormatPrice(price)}/$measure"
        }
    }

}

class ExampleUnitTest2 {


    @Test
    fun main() {
        println(message = formatPrice(price = 99.03721, discInProc = 10))
        println(message = formatPrice(price = 99.34578, measure = "кг", discInProc = 10))
        println(message = formatPrice(price = 100.0))
        println(message = formatPrice(price = 100.111111))

    }
}
