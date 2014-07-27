
case class Person(age: Int, height: Int, name: String)
val t = (1, 2, "aa")
t._1
t._2
t._3

val p = Person(1, 2, "aa")
p.name
p.age

var xs = Seq(1)

xs ++= Seq(2)

var x = 10

x += 1
x -= 1

1 - 3 * 4 //* 4 + 5

1 - 1

object M {
  def square(b: Int) =b * b
  def ++(b: Int) = b + 1
}

M square 10

M ++ 11

Seq(1)
  .map(_ + 1)
  .filter(_ > 3)
