
val x = 10

def While(cond: => Boolean)(body: ()  => Unit): Unit =
  if(cond) {
    body
    While(cond)(body)
  }

var y = 0

While(y < 10){
  println(y)
  y = y + 1
}
