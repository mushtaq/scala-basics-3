

import data._
import Data._
books foreach println
books.collect {
  case Book("odersky", title, _, _) => title
}
val pf: PartialFunction[Book, String] = {
  case Book("odersky", title, _, _) => title
}
books.filter(_.author == "odersky").map(_.title)
books.filter(pf.isDefinedAt).map(pf)
books.filter(b => pf.isDefinedAt(b)).map(b => pf(b))
books.collect {
  case Book("odersky", title, _, _) => title
}
books.map(_.basePrice).sum
books.sum