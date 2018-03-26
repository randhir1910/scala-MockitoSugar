package edu.knoldus

trait AddNumber {
  def add(x: Int, y: Int): Int
}

class Addition extends AddNumber {

  override def add(x: Int, y: Int): Int = {
    println("add two number")
    x + y
  }

}
object Add extends App {
  println("hello world")
}
