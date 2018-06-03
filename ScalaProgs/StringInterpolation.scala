package com.startscala

object StringInterpolation {
  def main(args : Array[String]){
val name = " Gaurav Vats"
val age = 32
println(name  +"  is " + age + " years old")
println(s"$name is $age years old")
println(f"$name%s is \n $age%d years old")
println(raw"$name%s is \n $age%d years old")
  }
}