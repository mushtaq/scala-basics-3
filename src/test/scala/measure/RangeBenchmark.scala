package measure

import org.scalameter.api._

object RangeBenchmark extends PerformanceTest.Quickbenchmark {
  val sizes  = Gen.range("size")(300000, 1500000, 300000)
  val ranges = sizes.map(0 until _)
  val iters  = ranges.map(_.toList.toIterable)
  val arrays = ranges.map(_.toBuffer)
  val seqs   = ranges.map(_.toVector)
  val lists  = ranges.map(_.toList)
  val sets   = ranges.map(_.toSet)

  println("===================")
//  performance of "Range" in {
//    measure method "map" in {
//      using(ranges) in { r =>
//        r.map(_ + 1)
//      }
//    }
//  }

  performance of "Concat" in {
    measure method "plus" in {
      using(seqs) in { s =>
        s ++ s
      }
    }

    measure method "colons" in {
      using(lists) in { s =>
        s ::: s
      }
    }

    measure method "reverse_colons" in {
      using(lists) in { s =>
        s reverse_::: s
      }
    }

    measure method "sets" in {
      using(sets) in { s =>
        s union s
      }
    }

    measure method "iters" in {
      using(iters) in { s =>
        s ++ s
      }
    }

    measure method "arrays" in {
      using(arrays) in { s =>
        s ++ s
      }
    }
  }
}
