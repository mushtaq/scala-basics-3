
val pf1: PartialFunction[Int, Int] = {
  case x if x > 10 => 10
  case x if x == 8 => 10
}

val pf2: PartialFunction[Int, Int] = {
  case x if x < 0 => 0
}

val pf3: PartialFunction[Int, Int] = {
  case x if x == 5 => 5
}

val pf = pf1.orElse(pf2).orElse(pf3)


val f = pf.lift

f(-10)
f(0)
f(3)
f(5)
f(11)

