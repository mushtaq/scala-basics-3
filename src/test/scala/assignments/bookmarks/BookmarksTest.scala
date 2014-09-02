package assignments.bookmarks

import org.specs2.mutable.Specification
import play.api.libs.json.{JsObject, Json}

class BookmarksTest extends Specification {

  "inline bookmarks" in {

    def readJson(filePath: String) =
      Json.parse(io.Source.fromFile(filePath).getLines().mkString("\n")).as[JsObject]

    val inputFile = "src/main/resources/bookmarks/input.json"
    val outputFile = "src/main/resources/bookmarks/expected.json"

    Bookmarks.inline(readJson(inputFile)) mustEqual readJson(outputFile)
  }
}
