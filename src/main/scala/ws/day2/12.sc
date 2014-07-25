
trait A {
  def m: Int
  def n = m.toString
}

trait B {
  def n: String
  def m = 10
}



class C extends A with B

val ab: A with B = new A with B
val ba: A with B = new B with A

val c = new C

c.m
c.n