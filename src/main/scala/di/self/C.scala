package di.self

trait C { self: B =>
   def c = b + "c"
 }
