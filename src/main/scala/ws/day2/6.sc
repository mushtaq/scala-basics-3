
object A {
  class Person private (var age: Int, val isFemale: Boolean) {
//    def this(age: Int) = this(age, false)
    def m = Person.b + 2
    private def n = "n"
  }
  object Person {
    private val b = 10
    def make(age: Int) = {
      val p = new Person(age, false)
      p.n
      p
    }
  }
  val p3 = Person.make(333)
  p3: p3.type

  val p = new Person(33, true)

}

