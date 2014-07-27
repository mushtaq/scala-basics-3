
import data._
import Data._

Seq(1).exists(_ > 10)
Seq(1).forall(_ > 10)

Seq.empty[Int].exists(_ > 10)
Seq.empty[Int].forall(_ > 10)

Option(1)

Option(books.head).exists(_.author == "odersky")
Option(books(4)).exists(_.author == "odersky")
Option.empty[Book].exists(_.author == "odersky")

Option(books.head).forall(_.author == "odersky")
Option(books(4)).forall(_.author == "odersky")
Option.empty[Book].forall(_.author == "odersky")

Option(1).getOrElse(4)
Option.empty[Int].getOrElse(4)

Option(1).orElse(Option(2))
Option.empty[Int].orElse(Option(2))









