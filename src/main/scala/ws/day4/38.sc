import java.util
import collection.JavaConversions._

val xs = new util.ArrayList[Int]()
xs.add(1)
xs.add(2)
xs.add(3)

val ys = xs

ys

def m(xs: Seq[Int]) = xs.length

m(xs)
