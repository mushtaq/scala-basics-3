
object A {
  object @@ {
    def unapply(email: String): Option[(String, String)] =
      email.split("@") match {
        case Array(user, domain) => Some((user, domain))
        case _                   => None
      }
  }

  "mushtaq@tw.com" match {
    case u @@ d => s"Hello $u"
    case _           => "wrong email"
  }

}
