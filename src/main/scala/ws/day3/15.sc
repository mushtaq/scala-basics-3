
def m(a: Any) = a match {
  case Seq() => 0
  case Seq(1, 2, x) => x
  case 1 => 1
  case 2 => 2
  case s @ "aaa" => s.length
  case x: String => x.length + 10
  case (1, "aa") => 1 + 20
  case (1, x: String) if x.length > 3 =>
    1 + x.length
  case t @ (1, x: String) if x.length > 1 => n(t)
  case (1, t@(4, x)) => t
  case (1, x) => 1 + x.toString
  case x => "error"
}

def n(t: (Int, String)) = t

m("asdasdasdadasd")