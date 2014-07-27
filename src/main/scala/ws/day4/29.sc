import ws.day4.Monoid

def sum[T](xs: T*)(monoid: Monoid[T]): T =
  xs.foldLeft(monoid.zero)(monoid.add)

sum(1, 2, 3)(Monoid.intM)
sum("a", "b")(Monoid.strM)
sum(Option(1), Option(2), Option.empty[Int])(Monoid.optM(Monoid.intM))
sum(Option("a"), Option("b"), Option.empty[String])(Monoid.optM(Monoid.strM))
sum(("a", 1), ("b", 2))(Monoid.tupleM(Monoid.strM, Monoid.intM))
sum((1, "a"), (2, "b"))(Monoid.tupleM(Monoid.intM, Monoid.strM))
sum((Option(1), Option("a")), (Option(2), Option("b")))(
  Monoid.tupleM(Monoid.optM(Monoid.intM), Monoid.optM(Monoid.strM))
)


