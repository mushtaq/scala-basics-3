package di.self

trait B { self: A =>
   def b = a + "b"
 }
