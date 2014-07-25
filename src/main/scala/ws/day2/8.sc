
trait CanDrink {
  def apply(age: Int): Boolean

  final def isWise(age: Int) = apply(age) && age > 43
}

class X extends CanDrink {
  def apply(age: Int) = true

  override def isWise(age: Int) = {
    if(age > 100) true else super.isWise(age)
  }
}

new CanDrink {
  def apply(age: Int) = false
}
