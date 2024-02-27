package com.lannstark.lec12

fun main() {
    moveSomeThing(object : Movable {
        override fun move() {
            println("움직움직")
        }

        override fun fly() {
            println("날다날다")
        }
    })
}

private fun moveSomeThing(movable: Movable) {
    movable.move()
    movable.fly()
}
