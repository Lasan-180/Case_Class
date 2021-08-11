object question extends App {

  val p1 = Point(5,7)
  val p2 = Point(4,2)

  println("\nOur two points => ")
  println(p1)
  println(p2)

  //q1
  println("\nAddition of p1 and p2 is => "+(p1+p2))

  //q2
  println("\nAfter the moving => ")
  println(p1.move(7,2))
  println(p2.move(6,1))

  //q3
  println("\nDistance between p1 and p2 points is => "+p1.distance(p2))

  //q4
  println("\nInversions of the point values p1 and p2 =>" )
  println(p1.invert)
  println(p2.invert)

}

case class Point(x:Int,y:Int) {

  //q1(add given inputs)
  def +(that: Point) = Point(this.x + that.x, this.y + that.y)

  //q2 (move the given distances)
  def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

  //q3 (distance between given points)
  def distance(that:Point)= math.sqrt((this.x-that.x)*(this.x-that.x)+(this.y-that.y)*(this.y-that.y))

  //q4 (invert the values of a point)
  def invert = Point(y, x)

}


