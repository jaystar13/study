package com.lannstark.lec04

fun main() {

    val money1 = JavaMoney(1_000)
    val money2 = money1
    val money3 = JavaMoney(1_000)

    println(money1 == money3)
}
