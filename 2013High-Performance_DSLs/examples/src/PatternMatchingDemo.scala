object PatternMatchingDemo {

  trait Exp
  case class Const(l: Int) extends Exp
  case class Plus(l: Exp, r: Exp) extends Exp
  case class Mult(l: Exp, r: Exp) extends Exp

  def distr(in: Exp): Exp = in match {
    case Mult(x, Plus(y,z)) =>
      Mult(Plus(x, y), Plus(x, z))
    case m @ Mult(x, y) =>
      Mult(distr(x), distr(y))
    case p @ Plus(x, y) =>
      Plus(distr(x), distr(y))
    case x => x
  }
}


object CollectionsMatchingDemo {

  import scala.collection.immutable._
  val range = 0 until 10
  range foreach println

  range map (_ + 1)
  range filter (_ % 2 == 1)
  range flatMap (x=> 0 until x)
  range reduce (_ + _)

  val (odd, even) = range partition (_ % 2 == 1)
  odd zip even


  "abc" map (x => (x + 1).toChar)

  val digits = Map(1 -> "one", 2 -> "two")
  digits map (x => (x._2, x._1))

  val digitSet = BitSet(1,2,3)
  digitSet map (_ + 1)
  digitSet map (_ + "!")

}