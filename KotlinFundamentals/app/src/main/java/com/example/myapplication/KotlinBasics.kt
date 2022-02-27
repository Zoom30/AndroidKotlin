package com.example.myapplication

fun main() {
//    val heightPerson1 = 170
//    val heightPerson2 = 189
//
//    if (heightPerson1 > heightPerson2){
//        println("Height of person 1 grater than person 2")
//    }else if (heightPerson1 == heightPerson2){
//        println("They have the same height")
//    }
//    else{
//        println("Person 2 is taller than person 1")
//    }


//    var season = 3
//    when(season){
//        1 -> println("Spring")
//        2 -> println("Summer")
//        3 -> {
//            println("Fall")
//            println("Autumn")
//        }
//        4 -> println("Winter")
//        else -> println("Invalid season")
//    }
//
//
//    var month = 3
//    when(month){
//        in 3..5 -> println("Spring")
//        in 6..8 -> println("Summer")
//        in 9..11 -> println("Fall")
//        12, 1, 2 -> println("Winter")
//        else -> println("Invalid season")
//    }
//
//    var x = 1
//
//    do {
//        println(x)
//        x++
//    }while (x<=10)

    for (num in 1..10){
        println(num)
    }

    for (i in 1 until 50){
        println(i)
    }

    for (i in 60 downTo 3 step 4){
        println(i)
    }
}


fun avg(vararg n: Double) {
    var total = 0
    for (i in n){
        continue
    }
}