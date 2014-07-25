//abstract class CanDrink1(name: String) {
//  def apply(age: Int): Boolean
//
//  def isWise(age: Int) = apply(age) && age > 43
//}
//
//class Person1(name: String) extends CanDrink1(name + "asasd") {
//  def apply(age: Int) = true
//}
//new Person1("blah")

trait CanDrink {

  def x: Int

  protected def name: String

  def apply(age: Int): Boolean

  def isWise(age: Int) = apply(age) && age > 43

}

class Person1(val name: String) extends CanDrink {
  val x: Int = 101
  def apply(age: Int) = true
}

new Person1("blah").name


class Nitin(name: String) {
  private val age = name.length
}