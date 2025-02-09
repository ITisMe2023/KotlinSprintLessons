package org.example.lesson_1

fun main() {
    val seconds = 6480
    println("${"%02d".format(seconds / 3600)}:${"%02d".format((seconds % 3600) / 60)}:${"%02d".format((seconds % 3600) % 60)}")
}