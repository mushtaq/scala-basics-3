import collection.mutable.Map

case class Tax {
  val salesTaxMap = Map[String, Double]()
  salesTaxMap("Book") = 10.8
  salesTaxMap("Medicine") = 2.7

  val dutyMap = Map[String, Double]()
  dutyMap("Book") = 9.4
  dutyMap("Medicine") = 10.1
}

class Item(val name: String, val itemType: String, val isImported: Boolean, val basePrice: Double) {
  def getFinalPrice : Double = {
    val tax = Tax.apply
    val duty = if (isImported) tax.dutyMap(itemType) else 0
    basePrice * (1 + (tax.salesTaxMap(itemType)/100)) * (1 + duty/100)
  }
}

val book1 = new Item("Book1", "Book", false, 120.1)
val book2 = new Item("Book2", "Book", true, 1004)
val book3 = new Item("Book3", "Book", false, 87.8)
val medicine1 = new Item("Medicine1", "Medicine", false, 503.3)
val medicine2 = new Item("Book1", "Book", false, 19.3)
val billingList = Seq(book1, book2, book3, medicine1, medicine2)

for (transaction <- billingList) {
  val amount = transaction.getFinalPrice
  println(amount)
}
