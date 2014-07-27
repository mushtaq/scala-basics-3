
def concat(s1: String, s2: String): String =
if(s1 == null) s2
else if(s2 == null) s1
else s1 + s2

def concat1(s1: Option[String], s2: Option[String]): Option[String] =
if(s1 == None) s2
else if(s2 == None) s1
else
  Some(s1.get + s2.get)

def concat2(s1: Option[String], s2: Option[String]): Option[String] =
  (s1, s2) match {
    case (None, _) => s2
    case (_ , None) => s1
    case (Some(x), Some(y)) => Some(x+y)
  }

concat2(Option("a"), Option("b"))
concat2(Option("a"), None)
