import point.Point
import shape._

object Main {
  def main(args: Array[String]): Unit = {
    call_shape()
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
