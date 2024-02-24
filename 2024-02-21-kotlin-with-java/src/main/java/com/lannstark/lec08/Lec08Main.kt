package com.lannstark.lec08

fun main() {
//    printNameAndGender(name = "이재성", gender = "MALE")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String,
           num: Int = 3,
           useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg string: String) {
    for (str in string) {
        println(str)
    }
}
