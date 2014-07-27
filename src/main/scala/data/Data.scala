package data

case class Book(
  author: String,
  title: String,
  basePrice: Double,
  isImported: Boolean
  )

object Data {

  val books = Seq(
    Book("odersky", "scala prog", 100, false),
    Book("odersky", "complexity", 400, false),
    Book("misky", "ocaml prog", 1000, true),
    Book("misky", "sml", 88, false),
    Book("hickey", "clojure prog", 500, true)
  )
}
