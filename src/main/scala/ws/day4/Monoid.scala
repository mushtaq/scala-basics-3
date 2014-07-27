package ws.day4

trait Monoid[T] {
  def zero: T
  def add(a: T, b: T): T
}

object Monoid {
  implicit val intM = new Monoid[Int] {
    def zero = 0
    def add(a: Int, b: Int) = a + b
  }

  implicit val strM = new Monoid[String] {
    def zero = ""
    def add(a: String, b: String) = a + b
  }

  implicit def optM[T](implicit tM: Monoid[T]) = new Monoid[Option[T]] {
    def zero = Some(tM.zero)
    def add(a: Option[T], b: Option[T]) = (a, b) match {
      case (None, _) => b
      case (_, None) => a
      case (Some(x), Some(y)) => Some(tM.add(x, y))
    }
  }

  implicit def tupleM[T1, T2](implicit tM1: Monoid[T1], tM2: Monoid[T2]) = new Monoid[(T1, T2)] {
    def zero = (tM1.zero, tM2.zero)
    def add(a: (T1, T2), b: (T1, T2)) = (tM1.add(a._1, b._1), tM2.add(a._2, b._2))
  }

}