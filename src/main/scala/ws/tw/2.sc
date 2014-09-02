
trait Able {
  def doIt: String
}

trait Walkable extends Able {
  abstract override def doIt = "walk " + super.doIt
}

trait Talkable extends Able {
  abstract override def doIt = "talk " + super.doIt
}

class C extends Able {
  def doIt = "Class"
}
//class A extends Walkable with Talkable
//new Walkable with Talkable {
//}
//class A extends Talkable with Walkable {
//  override def doIt = "class " + super.doIt
//}
//class B(walkable: Walkable, talkable: Talkable) {
//  def m = walkable.walk + talkable.talk
//}


val a = new C with Talkable with Walkable {
  println("anonymous")
}
a.doIt


