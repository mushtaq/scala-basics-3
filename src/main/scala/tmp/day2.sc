object X {

  class Source
  case object Domestic extends Source {
    override def toString: String = "Sales Tax"
  }
  case object Imported extends Source {
    override def toString: String = "Import Duty"
  }
  class ItemType
  object Book extends ItemType
  object Medicine extends ItemType
  case class Item(name: String, ofType: ItemType, basePrice: Float,
                  source: Source = Domestic)
  case class Tax(source: Source, on: ItemType)

  object TaxMap {
    val taxes = Map[Tax, Float](
      Tax(Domestic, Book) -> 10.8F,
      Tax(Imported, Book) -> 9.4F,
      Tax(Domestic, Medicine) -> 2.7F,
      Tax(Imported, Medicine) -> 10.1F
    )
  }

  object ItemDB {
    val items = Seq[Item](
      Item("Book1", Medicine, 100F),
      Item("Book1", Medicine, 100F, Imported)
//      Item("Book1", Book, 120.1F),
//      Item("Book2", Book, 1004F, Imported),
//      Item("Book3", Book, 87.8F),
//      Item("Med1", Medicine, 503.3F),
//      Item("Med2", Medicine, 19.3F)
    )
  }

  case class Bill(items: Seq[Item], taxes: Map[Tax, Float]) {
    def calculate = {
      val netAmount = items.map(taxate).sum
      netAmount
    }
    private def taxate(item: Item): Float = {
      val taxedPrice = item.basePrice * (1 + taxes.getOrElse(Tax(item.source, item.ofType), 0F)/100)
      println(item.name+"   "+item.basePrice+"  "+taxedPrice)
      taxedPrice
    }
  }

  Bill(ItemDB.items, TaxMap.taxes).calculate
}