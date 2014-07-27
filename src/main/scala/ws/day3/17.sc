

object A {
  class Person(val name: String, val age: Int)
  object Person {
    def apply(name: String, age: Int) = new Person(name, age)
    def unapply(p: Person): Option[(String, Int)] = Some((p.name, p.age))
  }
  val p = Person("ashish", 33)
  val Person(n, a) = p

  def m(a: Any) = a match {
    case Person("mushtaq", age) if age > 33 => "hello"
    case Person("mushtaq", age)             => "hellobye"
    case Person(name, age)                  => s"hello $name"
  }
}

