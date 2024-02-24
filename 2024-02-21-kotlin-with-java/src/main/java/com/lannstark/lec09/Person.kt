package com.lannstark.lec09

fun main() {
/*    val person = Person("이재성", 30)
    println(person.name)
    person.age = 10
    println(person.age)

    val person2 = Person("이나윤")
    println(person2.name)
    println(person2.age)*/

    val person = Person()
    println(person.isAdult)
}
class Person(
    name: String = "이재성",
    var age: Int = 1
) {

    var name = name
        set(value) {
            field = value.uppercase()
        }

    val uppercaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블럭")
    }

    /*constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    } //부생성자

    constructor(): this("홍길동") {
        println("두 번째 부생성자")
    }
    */
    val isAdult: Boolean
        get() = this.age >= 20
}
