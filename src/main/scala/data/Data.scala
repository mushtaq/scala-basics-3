package data

import ws.day4.Monoid

case class Book(
  author: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
  )

object Book {
  implicit val bookM = new Monoid[Book] {
    def zero = Book("odersky", "scala prog", 100, false)
    def add(a: Book, b: Book) = Book(a.author, a.title, a.basePrice + b.basePrice, true)
  }
}
object Data {

  val books = Seq(
    Book("odersky", "scala prog", 100, false),
    Book("odersky", "apple", 100, false),
    Book("odersky", "complexity", 400, false),
    Book("misky", "ocaml prog", 1000, true),
    Book("misky", "sml", 88, false),
    Book("hickey", "clojure prog", 500, true)
  )
}
