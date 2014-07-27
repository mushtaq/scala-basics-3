 object A {

   val xs = Seq(1, 2, 3)
   xs: Int => Int
   xs(1)


   ys: Int => Boolean
   val ys = Set(1, 2)

   ys(3)


   val zs = Map(1 -> "a", 2 -> "b", 3 -> "c", 4 -> "d")
   zs: Int => String
   zs(1)

   xs.map(x => zs(x))
   xs map zs

   xs filter ys
 }
