package com.example.kotlinpractice

data class Ticket(val companyName: String, val name: String, var date: String, var seatNumber: Int)
// data class를 이용하면 toString(), hashCode(), equals(), copy() 메소드를 자동으로 만들어줌.

class TicketNormal(val companyName: String, val name: String, var date: String, var seatNumber: Int)

fun main() {
    val ticketA = Ticket("koreanAir","heebumKim","2023-01-12",14)
    val ticketB = TicketNormal("koreanAir","heebumKim","2023-01-12",14)

    println(ticketA) // data class의 toString()의 출력내용 => Ticket(companyName=koreanAir, name=heebumKim, date=2023-01-12, seatNumber=14)
    println(ticketB) //일반 class의 toString()의 출력내용 => com.example.kotlinpractice.TicketNormal@6fadae5d
}