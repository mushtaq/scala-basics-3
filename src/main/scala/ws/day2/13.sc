trait A { self: B =>
  def x = 10
  def b = a + 2
}

trait B { self: A =>
  def y = x + 100
  def a = 1
}

new A with B
new A
new B

class C extends A with B

val c = new C
c.a
c.b
c.x
c.y