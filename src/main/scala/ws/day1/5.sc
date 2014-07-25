

def add(a: Int, b: Int) = a + b

def adder2(b: Int) = add(2, b)
def adder3(b: Int) = add(3, b)

adder2(10)
adder3(10)

def add1(a: Int)(b: Int) = a + b
val curr = add1 _

val cAdder2 = curr(2)
val cAdder3 = add1(3) _

def applier(x: Int, adder: Int => Int) =
  adder(x)

cAdder2(10)
cAdder3(10)

applier(10, add1(100))
applier(10, add1(101))

applier(10, x => add(100, x))
applier(10, x => add(101, x))
applier(10, x => add(101, x))

def dd(x: Int) = add(101, x)

applier(10, dd)


