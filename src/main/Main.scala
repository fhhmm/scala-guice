import point.Point

object Main {
  def main(args: Array[String]): Unit = {
    val p1: Point = new Point(10, 10)
    val p2: Point = new Point(100, 100)
    println(p1.distance(p2))
    println(p1 + p2)
  }
}
