package assignments.bookmarks

import org.specs2.mutable.Specification
import play.api.libs.json.{JsObject, Json}

class BookmarkerTest extends Specification {

  "inline bookmarks" in {

    def readJson(filePath: String) =
      Json.parse(io.Source.fromFile(filePath).mkString).as[JsObject]

    val inputFile = "src/main/resources/bookmarks/input.json"
    val outputFile = "src/main/resources/bookmarks/expected.json"

    Bookmarker.inline(readJson(inputFile)) mustEqual readJson(outputFile)
  }
}
