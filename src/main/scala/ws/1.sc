
println("aaa")

class MahaCanDrink extends (Int => Boolean) {
  def apply(age: Int) = age > 40
}

val ncrCanDrink = new (Int => Boolean) {
  def apply(age: Int) = age > 10
}

class Person(age: Int, isFemale: Boolean) {

  def isWise = if(isFemale) age > 18 else age > 21

  def canMarry(canDrink: Int => Boolean) = isWise && canDrink(age)
}


val p = new Person(100, true)

p.canMarry(ncrCanDrink)
p.canMarry(new MahaCanDrink)
p.canMarry(new (Int => Boolean) {
  def apply(age: Int) = false
})




