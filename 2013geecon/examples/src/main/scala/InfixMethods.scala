import java.math.BigInteger
import scala.annotation._

   // TODO missing implicit parameters
   // TODO precedence of prefix and postfix

   // Operators as Methods
  object BigInt {
 	 def apply(v: Int): BigInt =
 	   new BigInt(new BigInteger(v.toString))

   	 def apply(v: BigInteger): BigInt = new BigInt(v)
   }

   class BigInt(val v: BigInteger) {
     def +(that: BigInt): BigInt = BigInt(v add that.v)
     def +(that: Int): BigInt = this + BigInt(that)

     def -(that: BigInt): BigInt = BigInt(v subtract that.v)
     def -(that: Int): BigInt = this - BigInt(that)

     def *(that: BigInt): BigInt = BigInt(v multiply that.v)
     def *(that: Int): BigInt = this * BigInt(that)

     def unary_-(): BigInt = BigInt(0) - this
     def !(): BigInt = if ((BigInteger.ONE compareTo this.v) == 1)
        BigInt(1)
      else
        this * (this - 1).!

     override def toString: String = v.toString
   }

object Main extends App {
   // Slide 2
   val v1 = BigInt(23)
   val res = v1.+(19)
   println(res)

   // Slide 3
   println(-BigInt(3).! + (BigInt(4)!) * (BigInt(2)!))

   implicit def liftBigInt(t: BigInteger) = BigInt(t)
   implicit def intToBigInt(t: Int) = BigInt(t)
   val v = new BigInteger("3")
   println(-(v!) + (4!) * (2!))

   ()
}