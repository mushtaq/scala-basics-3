
import data._
import Data._
object A {
  books foreach println
  books.groupBy(_.author).mapValues(_.map(_.basePrice).sum) foreach println
  val xs = Seq(1, 2, 3)
  val ys = Seq("a", "b")
  xs
    .filter(_ > 1)
    .flatMap { x =>
    ys
      .filter(_ != "b")
      .map(y => x -> y)
  }

  xs
    .filter(_ > 1)
    .foreach { x =>
    ys
      .filter(_ != "b")
      .foreach(y => println(x -> y))
  }

  for {
    x <- xs
    if x > 1
    y <- ys
    if y != "b"
  } println(x -> y)
  Map(1 -> "a", 2 -> "b").map { case (k, v) => v -> k }
}

