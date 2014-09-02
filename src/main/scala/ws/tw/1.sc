
1

abstract class Comparator[T](c: Int) {
  def compare(a: T, b: T): Int
  def compare1(a: T, b: T) = compare(a, b)
}



//interface Comparator[T] {
//  val x = 10
//  def compare(a: T, b: T): Int
//  def compare1(a: T, b: T) = compare(a, b)
//}


