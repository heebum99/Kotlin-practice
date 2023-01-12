package com.example.kotlinpractice

fun main() {

}

//5. Array and List
//Array => 메모리 크기가 할당되어있음, 미리 지정
//List => List(수정 x) vs MutableList(수정 o)
fun array() {
    val array = arrayOf(1, 2, 3) //arrayOf()를 이용해 Array 초기화
    val list = listOf(1, 2, 3) //listOf()를 이용해 List 초기화

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    //list[0] = 2 => 오류발생, 값을 변경할 수 없음.

    val arrayList = arrayListOf<Int>() //MutableList
    arrayList.add(10)
    arrayList.add(20)

    //arrayList = arrayListOf() => val(상수)로 선언했기에 주소를 재할당할 수 없음
}