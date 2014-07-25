
trait A {
  def canDrink(age: Int): Boolean = true
}

trait CanDrink extends A{
//  val x = 100
  override def canDrink(age: Int) =
    age > 19 && super.canDrink(age)
}
trait CanRun extends A{
  override def canDrink(age: Int) = age > 19
//  val y = 200
  def canRun(age: Int) = age < 90
}
class Person extends CanDrink with CanRun
class Person1 extends CanRun with CanDrink

val p = new Person
val p1 = new CanDrink with CanRun

//p.x
//p.y
1
