

object Virtualization {

  def __ifThenElse[T](c: Boolean, t: => T, e: => T): Unit =
    println(s"if ($c) $t else $e")

  def __whileDo[T](c: Boolean, t: => Unit) = {
    println(s"while($c) {")
    t
    println(s"}")
  }

  // def println(t: String): Unit = Predef.println(s"println($t)")

  while (true) {
  	if (true) println("true") else println("false")
  }
}