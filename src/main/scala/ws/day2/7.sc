
case class Address(line1: String, pin: Int)
case class Person(age: Int, isFemale: Boolean, add: Address) {
  def incrementedPin = copy(add = add.copy(pin = add.pin + 1))
}

val p = Person(23, true, Address("baner", 21))

def increaseAge(p: Person) =
  p.copy(age = p.age +1)
def increasePin(p: Person) = p.incrementedPin

def compare(p1: Person, p2: Person) = p1 == p2
