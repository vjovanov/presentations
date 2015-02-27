package main.scala.methods1

import java.math.BigInteger

object BigInt {
  def apply(v: Int): BigInt =
    new BigInt(new BigInteger(v.toString))
}

class BigInt(val v: BigInteger) {
  def +(that: Int): BigInt = this + BigInt(that)
  // ...
}

object Main extends App {
  val v1 = BigInt(23)
  println(v1 + 19)
}
