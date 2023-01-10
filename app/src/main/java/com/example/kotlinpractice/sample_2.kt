package com.example.kotlinpractice

fun main() {
    //3.String Template
    val name = "heebum"
    val lastName = "Kim"
    println("my name is ${name + lastName} I'm 25") //변수 출력시 ${변수명} 형식으로 사용

    println("is this true? ${1 == 0}")

    println("this is 2\$") //$문자를 사용하고 싶을땐 \$

    checkNum(1)
}

//4.조건식 => if, when
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

//위의 함수와 동일
fun maxBy2(a: Int, b: Int) = if (a > b) a else b //삼항연산자가 따로 없음.

fun checkNum(score: Int) {
    when (score) { //Statement
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3") //복수 정답 인정
        else -> println("I don't know") //이런 경우 else 생략가능
    }

    var b = when (score) { //Expression
        1 -> 1
        2 -> 2
        else -> 3 //이런 경우 else 생략 x
    }

    println("b : ${b}")

    when (score) {
        in 90..100 -> println("You ar genius")
        in 10..80 -> print("not bad")
        else -> println("okay") //80~90사이인 경우, else 생략가능
    }
}

//Expression(표현식) vs Statement 차이점
//Expression => 값을 반환하는 역할을 함, else가 필수
//Statement => 명령을 지시하는 문장, else 생략 가능