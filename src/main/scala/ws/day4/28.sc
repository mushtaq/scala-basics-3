
def int2Str(a: Int) = a.toString
def str2List(s: String) = s.toList
def int2List(age: Int) = str2List(int2Str(age))

int2List(1023)

val f1 = {a: Int => a.toString}
val f2 = {s: String => s.toList}
val f = f1 andThen f2
val fx = f2 compose f1

f(1023)
fx(1023)
