package com.example.kotlinpractice

fun main() {
    nullcheck()
    ignoreNulls("hi")
}

//7.Nullable / NonNull

fun nullcheck() {
    //NPE: Null pointer Exception
    // ? => 변수의 값이 null일수 있다는 것을 표시 => ?를 해주지 않으면 null값을 넣을수 없음
    var name: String = "heebum" //nonNull type이기에 null값을 넣으면 오류발생

    //Nullable 타입은 ?만 붙여주면됨
    var nullName: String? = null

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase =
        nullName?.toUpperCase() // nullName이 null이 아니면 toUpperCase(), null이면 null값 반환

    // ?: 엘비스 연산자
    // null값 대신 default값으로 리턴
    val lastName: String? = null

    val fulName = name + " " + (lastName
        ?: "No lastName") //lastName이 있으면 그대로 출력하고 없으면 null 대신 No lastName을 출력
    println(fulName)
}

//!! => null이 아님을 표시, 컴파일러에게 알려주는 역할
//!!는 변수값이 확실히 null이 아닌 경우에만 사용해줘야함
fun ignoreNulls(str: String?) {
    //val mNotNull : String = str => mNotNull은 NonNull타입인데 str은 Nullable 타입이라 오류 발생
    val mNotNull: String = str!! //!!를 사용해 컴파일러에게 str에 null값이 아니라는 것을 표시해줌으로 오류 해결
    val upper = mNotNull.toUpperCase()

    val email: String? = "heebumXXXX@naver.com"
    email?.let{ //email이 null이 아니면 let실행
        //let => 자신의 리시버 객체(여기서는 email)를 람다식 내부로 옮겨주는 역할
        println("my email is ${email}")
    }
}