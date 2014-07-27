import ws.day4.Monoid
import data._
import Data._
def sum[T](xs: T*)(implicit monoid: Monoid[T]): T =
  xs.foldLeft(monoid.zero)(monoid.add)

def sum1[T : Monoid](xs: T*): T = {
  val monoid = implicitly[Monoid[T]]
  xs.foldLeft(monoid.zero)(monoid.add)
}
sum(1, 2, 3)
sum("a", "b")
sum(Option(1), Option(2), Option.empty[Int])
sum(Option("a"), Option("b"), Option.empty[String])
sum(("a", 1), ("b", 2))
sum((1, "a"), (2, "b"))
sum(books: _*)

{
  implicit val intM1 = new Monoid[Int] {
    def zero = 100
    def add(a: Int, b: Int) = a + b
  }
  sum((Option(1), Option("a")), (Option(2), Option("b")))
}
