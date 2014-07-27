import data._
import Data._
import ws.day4.ExtMeths.RichAny

//books foreach println
books.sortBy(b =>(b.basePrice, b.title.reverseOrder)) foreach println
//books.sortWith(
//  _.basePrice > _.basePrice
//) foreach println
//
//
