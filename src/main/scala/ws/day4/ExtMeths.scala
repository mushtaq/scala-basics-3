package ws.day4

object ExtMeths {
  implicit class RichAny[T](a: T) {
    def reverseOrder = Reversable(a)
  }

  case class Reversable[T](value: T)
  
  object Reversable {
    implicit def reverseOrdering[T: Ordering]: Ordering[Reversable[T]] = Ordering[T].reverse.on(_.value)
  }
}
