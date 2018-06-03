package com.startscala

object WhileDoWhileFor {
  def main(test: Array[String]) {
    var x: Int = 0
    while (x < 10) {
      println("x====" + x)
      x = x + 1
    }

    do {
      println("x inside do while====" + x)
      x = x + 1
    } while (x == 5)

    for (i <- 1 to 5)
      println("value of i using to::::" + i)

    for (i <- 1.to(5))
      println("value of i using to::::" + i)

    for (i <- 1.until(6))
      println("value of i using until::::" + i)

    for (i <- 1.until(6); j <- 1 to 3)
      println("value of i using until::::" + i + " value of j::" + j)

    var lst = List(10, 20, 30, 40, 50, 60, 70)
    for (i <- lst)
      println("value of i using List::::" + i)

    for (i <- lst; if (i < 50))
      println("value of i using List filter::::" + i)

    val itr = for { i <- lst; if (i < 50) } yield {
      i * 10
    }
    println("value of itr::::" + itr)
  }
}