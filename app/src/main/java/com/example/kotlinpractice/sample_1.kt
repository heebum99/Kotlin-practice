package com.example.kotlinpractice

fun main() {
    helloWorld()

    println(add(4, 5))
}

// 1.함수, 맨 앞에는 항상 fun으로 시작

//리턴타입이 없는경우
fun helloWorld(): Unit { //리턴값이 없을때 Unit(=void) 혹은 생략가능
    println("Hello World!")
}

//리턴 타입 + 매개변수가 있는경우
//변수명은 타입보다 먼저 작성, 타입은 : 뒤에 작성, 변수 타입의 첫글자는 대문자로
fun add(a: Int, b: Int): Int {
    return a + b
}

// 2. val vs var 차이
//val = value => 변하지 않는 값(상수)
//var = variable => 변할수 있는 값
fun hi() {
    val a: Int = 10
    var b: Int = 9
    //a = 100 => 오류발생, 상수는 값을 변경할수 없기 때문
    b = 100 //값을 변경할 수 있음.

    val c = 100 //바로 초기화 시 변수 타입은 적지 않아도 되지만 val 과 var는 구분해서 적어줘야함
    var d = 100
    var name = "heebum"

    //변수를 선언과 동시에 초기화하지않는 경우 타입을 적어줘야함
    var e: String

}