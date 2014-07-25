import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer

def map(xs: Seq[Int], f: Int => Int): Seq[Int] = {
  val result = ArrayBuffer.empty[Int]
  val it = xs.iterator
  while (it.hasNext) {
    result += f(it.next())
  }
  result
}

def map1(xs: Seq[Int], f: Int => Int): Seq[Int] = {
  var result = Seq.empty[Int]
  val it = xs.iterator
  while (it.hasNext) {
    val y: Int = f(it.next())
    result = result.:+(y)
  }
  result
}

def map2(xs: Seq[Int], f: Int => Int): Seq[Int] = {
  if(xs.isEmpty)
    Seq.empty
  else
    map2(xs.tail, f).+:(f(xs.head))
}

def map3(xs: Seq[Int], f: Int => Int): Seq[Int] = {

  @tailrec
  def loop(remaining: Seq[Int], acc: Seq[Int]): Seq[Int] = {
    if(remaining.isEmpty)
      acc
    else {
      val newAcc =  acc :+ f(remaining.head)
      loop(remaining.tail, newAcc)
    }
  }

//  lazy val loop1: (Seq[Int], Seq[Int]) => Seq[Int] = { (remaining, acc) =>
//    if(remaining.isEmpty)
//      acc
//    else {
//      val newAcc =  acc :+ f(remaining.head)
//      loop1(remaining.tail, newAcc)
//    }
//  }

  loop(xs, Seq.empty)
}

def square(a: Int) = a * a
map3(1 to 100, square)




