package com.example.kotlinpractice

fun main() {
    forAndWhile()
}

//6. For / While
fun forAndWhile() {
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) { //withIndex()를 사용하면 이름과 인덱스를 함께 사용가능
        println("${index + 1}번째 학생 : ${name}")
    }

    var sum: Int = 0

    for (i in 1..10 step 2) { //1~10까지 2만큼의 간격으로 더하라
        sum += i
    }

    println("${sum}")

    for (i in 10 downTo 1) { //10부터 차례로 1까지
        println(i)
    }

    for (i in 1 until 100) { //1부터 100이전까지, 1..100과의 차이점 100을 포함하냐 마냐
        println(i)
    }

    var index = 0
    while (index < 10) {
        println("current index : ${index}")
        index++
    }
}