
Seq(1).map(_ + 10)
Seq.empty[Int].map(_ + 10)

Option(1).map(_ + 10)
Option.empty[Int].map(_ + 10)

val xs = Option(1)
val ys = Option(2)

xs.flatMap(x => ys.map(y => x + y))

for {
  x <- xs
  if x > 0
  y <- Option.empty[Int]
  if y > 1
} yield x + y

