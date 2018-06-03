package com.startscala

object IfElseProg {
  def main(arg: Array[String]) {
    val x: Int = 18
    val y: Int = 20
    if (x >= 18)
      println("Adult")
    else if (x < 18)
      println("Junior")
    else
      println("Senior")

    var status = if (x < 15) "Not Eligible for Vote" else "Eligible for Vote"
    println(status)

    println(if (x < 15) "Not Eligible for Vote" else "Eligible for Vote")

    if (x == 18 && y == 20)
      println("And Condition True")
    else
      println("And Condition False")

    if (x == 30 || y == 20)
      println("OR Condition True")
    else
      println("OR Condition False")
  }
}