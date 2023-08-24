import employee.Employee
import point.Point
import shape.impl._
import shop.Shop

object Main {
  def main(args: Array[String]): Unit = {
    call_shop()
  }

  def call_shop(): Unit = {
    val shop = new Shop("Shop1")

    // shop.filter(x => x.age >= 20)
    shop.filter(_.age >= 20)

    shop.map(_.name)
    shop.toList
    shop.display()
  }

  def call_point(): Unit = {
    val p1: Point = new Point(10, 10)
    val p2: Point = new Point(100, 100)
    println(p1.distance(p2))
    println(p1 + p2)
  }

  def call_shape(): Unit = {
    val triangle = new Triangle
    triangle.draw()
    val rectangle = new Rectangle
    rectangle.draw()
  }
}
