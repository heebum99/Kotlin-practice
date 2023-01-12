package com.example.kotlinpractice

open class Human constructor(val age: Int = 19) { //constructor => 생성자, ()안에 변수명 : 타입입력, constructor 생략가능, default값 지정 가능, 주 생성자
    init { //init(주 생성자의 일부)을 통해 생성자가 실행됨과 동시에 init 블록이 실행
        println("New human has been born!")
    }

    constructor(
        name: String,
        age: Int
    ) : this(age) { //constructor(부 생성자)는 주 생성자의 this()를 통해 위임을 받아야한다.
        println("my name is ${name}, ${age}years old")
    }

    //필드 변수
    val name = "heebum"
    //val age = age => 생성자를 통해 변수 초기화, 이 문장은 생략해줘도 age변수를 필드변수로 사용가능

    //메서드
    fun eatingCake() {
        println("This is so YUMMMMMMY~~")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human() { //상속받기 위해서 :클래스명, 모든 클래스들은 상속해주기 위해서 open 해줘야한다.
    //메소드 오버라이딩
    override fun singASong(){ //singASong()메소드를 오버라이딩 하기 위해서 open 해줘야한다.
        super.singASong() //부모 클래스(Human)의 singASong()메소드 호출
        println("라라라")
        println("my name is :${name}")
    }
}


fun main() {
    val human = Human(13)

    human.eatingCake()
    println("This human's name is ${human.name}, ${human.age} years old")

    val mom = Human("Kuri", 52)

    val korean = Korean()
    korean.singASong()
}