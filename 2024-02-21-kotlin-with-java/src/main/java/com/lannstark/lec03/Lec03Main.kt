package com.lannstark.lec03

fun main() {
    val str = "ABC"
    println(str[0])
    println(str[1])
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}
