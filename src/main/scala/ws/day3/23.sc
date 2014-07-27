

val xs = List(7, 6, 5, 1, 2, 9, 3, 10, 8, 4)
xs.take(3)
xs.drop(3)
val (taken, afterDrop) = xs.splitAt(3)
xs.filter(_ > 4)
xs.filterNot(_ > 4)
xs.partition(_ > 4)
xs.takeWhile(_ < 9)
xs.dropWhile(_ < 9)
xs.span(_ < 9)


(1, "a")
Tuple2(1, "a")