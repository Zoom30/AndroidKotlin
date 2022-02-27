package com.example.myapplication

fun main() {
    val heightPerson1 = 170
    val heightPerson2 = 189

    if (heightPerson1 > heightPerson2){
        println("Height of person 1 grater than person 2")
    }else if (heightPerson1 == heightPerson2){
        println("They have the same height")
    }
    else{
        println("Person 2 is taller than person 1")
    }
}