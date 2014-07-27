
val xs = Option(1)
val ys = Option(2)

(xs ++ ys).min

Seq.empty[Int].headOption

Seq(1, 2, 3).max

"23-04-2010"

val Date = """(\d{2})-(\d{2})-(\d{4})""".r

val Date(day, month, year) = "23-04-2010"
"23-04-2010" match {
  case Date(d, m, y) => d
}

val D = 10

11 match {
  case D => 1
}








