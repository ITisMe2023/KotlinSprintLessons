package org.example.lesson_1

fun main() {
    val year: Int = 1961

    var hour: Int = 9
    var minute: Int = 7

    println("Год полета: $year\n" +
            "Час полета: ${"%02d".format(hour)}\n" +
            "Минута полета: ${"%02d".format(minute)}\n")

    hour = 10
    minute = 55

    println("Время посадки: $hour:$minute")
}