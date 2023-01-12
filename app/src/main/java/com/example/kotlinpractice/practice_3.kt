package com.example.kotlinpractice

//companion object => 자바에서 static과 같은 역할, 정적인 메소드/변수 선언시 사용
class Book private constructor(
    val id: Int,
    val name: String
) { // private constructor => 객체 생성을 외부에서 못하게
    // companion object의 역할 => private 변수나 메소드를 읽어올수 있게 하는 역할, static과 같은 역할, 이름생성과 상속 가능
    companion object BookFactory : IdProvider {
        override fun getId(): Int {
            return 444
        }

        val myBook = "new book"
        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId(): Int
}

fun main() {
    //val book = Book.Companion.create() => Companion 생략 가능, 이름이 있을경우 Companion을 생략하거나 이름을 써줘야함
    val book = Book.BookFactory.create()

    val bookId = Book.getId()
    println("${book.id} ${book.name}")
}