
class A {
  def x = 10
  def print = println(x)
}

class B extends A {
  private var _x = 11
  override def x = _x
  override def print = super.print
}

val b = new B

b.print



