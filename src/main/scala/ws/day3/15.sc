import data.Book
import play.api.libs.json._

1

val json = Json.arr(1, 2, 3, 4)

implicit val aa = new Reads[Int] {
  def reads(json: JsValue): JsResult[Int] = json match {
    case JsNumber(n) ⇒ JsSuccess(n.toInt + 100)
    case _ ⇒ JsError("can only read numbers in ints")
  }
}

json.as[Seq[Int]]

Json.reads


Ordering[Book]





