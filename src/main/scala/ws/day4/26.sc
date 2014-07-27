
val xs = Seq(1, 2, 3, 4)
val ys = Seq.empty[Int]

xs.foldLeft(0)(_ + _)
xs.foldLeft(1)(_ * _)
xs.foldLeft("")(_ + _)

xs.reduceLeft(_ + _)
xs.reduceLeft(_ * _)


//ys.reduceLeft(_ + _)

Seq("aaa", "bb").reduceLeft(_ + _)
