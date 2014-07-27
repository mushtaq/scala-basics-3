package ws.day4

object Demo {

  implicit val intM1: Monoid[Int] = new Monoid[Int] {
    def zero = 100
    def add(a: Int, b: Int) = a + b
  }

  def sum[T](xs: T*)(implicit monoid: Monoid[T]): T =
    xs.foldLeft(monoid.zero)(monoid.add)

  def a1 = sum(1, 2, 3)
  def a2 = sum("a", "b")
  def a3 = sum(Option(1), Option(2), Option.empty[Int])
  def a4 = sum(Option("a"), Option("b"), Option.empty[String])
  def a5 = sum(("a", 1), ("b", 2))
  def a6 = sum((1, "a"), (2, "b"))
  def a7 = sum((Option(1), Option("a")), (Option(2), Option("b")))
}

