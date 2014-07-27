val square: Function1[Int, Int] = {
  x => x * x
}

square(10)

val divideBy: Function1[Int, Int] = {
  x => 100 / x
}

val divideByP: PartialFunction[Int, Int] = {
  case x if x != 0 => 100 / x
}

def m(x: Int) =
  if(divideByP.isDefinedAt(x)) divideByP(x) else 0

m(50)