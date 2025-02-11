package org.example.lesson_1

fun main() {
    val flySeconds = 6480
    val hours = flySeconds / 3600
    val minutes = (flySeconds % 3600) / 60
    val seconds = (flySeconds % 3600) % 60

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}