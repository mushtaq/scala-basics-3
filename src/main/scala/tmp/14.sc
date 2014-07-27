trait Tax{
  val tax: Double
  def calculateTax(basePrice: Double,isImported: Boolean):Double
}

case class SalesTax(tax: Double) extends Tax {
  override def calculateTax(basePrice: Double, isImported: Boolean): Double = (basePrice * tax).floor;
}

case class ImportDuty(tax: Double) extends Tax {
  override def calculateTax(basePrice: Double,isImported: Boolean):Double = {
    if(isImported){
      (basePrice * tax).ceil
    }else {
      0.0
    }
  }
}


trait Item {
  val basePrice: Double
  val isImported: Boolean
  val taxes: Seq[Tax]
}
case class Book(basePrice: Double, isImported: Boolean, taxes: Seq[Tax]) extends Item
case class Medicine(basePrice: Double, isImported: Boolean, taxes: Seq[Tax]) extends Item

def calculateTotal(item: Item):Double = {
  item.taxes.map(tx => tx.calculateTax(item.basePrice,item.isImported) + item.basePrice).sum
}
val bookTaxes = Seq(new SalesTax(10.8),new ImportDuty(9.4))
val medicineTaxes = Seq(new SalesTax(2.7),new ImportDuty(10.1))
val book0 = Book(10,false,bookTaxes)
val book00 = Book(10,true,bookTaxes)
val book1 = Book(120.1,false,bookTaxes)
val book2 = Book(1004,true,bookTaxes)
val book3 = Book(87.8,false,bookTaxes)
val medicine1 = new Medicine(503.3,false,medicineTaxes)
val medicine2 = new Medicine(19.3,false,medicineTaxes)

val cart = Seq(book0,book00,book1,book2,book3,medicine1,medicine2)
cart.foreach(x => println(x.toString + " " + calculateTotal(x)))

