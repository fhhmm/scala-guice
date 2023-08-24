package shop

import mytrait._

class Staff(val name: String, val age: Int)

class Shop(val name: String) extends AnyRef with Enumerable with Namable {
  private[this] val staffs: List[Staff] =
    List(new Staff("Alice", 20), new Staff("Bob", 30))

  override def foreach[B](f: A => B): Unit = staffs.foreach(f)
}
