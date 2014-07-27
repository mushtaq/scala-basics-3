
class AA(x: Int) {

  private[this] val y = x
  def add(a: AA) = y + a.y
}

val a1 = new AA(10)
val a2 = new AA(120)

a1.add(a2)
