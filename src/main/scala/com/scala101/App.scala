package com.scala101

/**
 * Hello world!
 *
 */
object App {
  def main(args: Array[String]) {
    println("We're running scala..")
    val service = new SomeJavaService
    println(service.getInfo())

    val start = System.currentTimeMillis();
    var total = 0;for(i <- 0 until 100000) { total += i };
    val end = System.currentTimeMillis();
    println(end-start);
    println(total);

  }
}
