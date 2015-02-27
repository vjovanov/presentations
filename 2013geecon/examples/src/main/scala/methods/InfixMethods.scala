package slide1

import java.math.BigInteger
object BigInt {
  def apply(v: Int): BigInt =
    new BigInt(new BigInteger(v.toString))
  def apply(v: BigInteger): BigInt = new BigInt(v)
}

class BigInt(val v: BigInteger) {
  def +(that: BigInt): BigInt = BigInt(v.add(that.v))
  def +(that: Int): BigInt = this.+(BigInt(that))
  // ...
}

object Main extends App {
  val v1 = BigInt(23)
  println(v1.+(19))
}
