package com.example.kotlinpractice

// 1.Lamda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 익명함수
// 1)메소드의 파라미터로 넘겨줄 수 있다.
// 2)return 값으로 사용할 수 있다.

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}

//val square = { number : Int -> number * number } => 아래와 동일
val square: (Int) -> (Int) =
    { number -> number * number } //제곱 기능을 하는 람다식, Int형을 파라미터로 받고 그 값을 제곱한 (Int형)을 return 해준다.

val nameAge = { name: String, age: Int ->
    "my name is ${name} I'm ${age}" //리턴 값
}

fun main() {
    println(square(12))
    println(nameAge("heebum", 99))

    val a = "heebum said "
    val b = "mac said "
    //변수 a, b는 String클래스의 객체이기 때문에 pizzaIsGreat이라는 확장 함수를 사용할수 있음.
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))

    println(calculateGrade(97))

    val lamda = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22})) //마지막 파라미터가 람다식일때 => invokeLamda{it > 3.22}로 () 생략가능, it은 파라미터가 한개일때 사용가능
}

// 확장 함수 => 어떤 클래스에 대해서 함수를 추가하고 싶을때 사용
// String 클래스에 함수 추가
val pizzaIsGreat: String.() -> String = {
    this + "Pizza is the best!" //이 자체가 리턴 값
}

fun extendString(name: String, age: Int): String { //파라미터로 name, age를 받고 String을 return
    val introduceMyself: String.(Int) -> String = { //원래는 파라미터를 적어줘야하지만 파라미터가 한개인 경우 it을 이용할수 있음
        "I am ${this} and ${it} years old" //it을 통해 Int 값을 받아옴, this는 확장함수의 객체(String, String.(Int)이므로)를 가리킴
    }

    return name.introduceMyself(age)
}

// 람다의 return
val calculateGrade: (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

//람다를 사용하는 여러가지 방법
fun invokeLamda(lamda: (Double) -> Boolean): Boolean { //파라미터 값으로 람다를 사용
    return lamda(5.2343)
}

//코틀린 인터페이스가 아닌 자바 인터페이스면서 딱 하나의 메소드만 가질때 람다식 사용가능
/*
button.setOnClickListener(object : View.OnClickListener { // 1(일반적)
    override fun onClick(){
        //to do...
    }
}

button.setOnClickListener{ // 2(람다식 이용)
    //to do..
}
조건하에 1번과 2번은 동일
*/