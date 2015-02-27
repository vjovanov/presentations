//import scala.swing.event.{MouseEntered, MouseExited, MouseClicked}
//
//trait Animal
//
//trait Mammal extends Animal {
//  def think() {
//    println( “ hm...”)
//  }
//}
//
//trait Bird extends Animal {
//  def layEgg() = System.createEgg()
//}
//
//class Platypus extends Bird with Mammal
//
//
//trait Lazy {
//  def layInTheSun() {}
//}
//
//class Cat(name: String) extends Mammal
//
//new Cat("Garfield") with Lazy
//
//
//trait Logging {
//  def log(msg: String)
//}
//
//trait AnimalManager {
//  self =>
//  DAO
//
//  def getByName(msg: String): Animal
//}
//
//trait AnimalService {
//  self: Logging with AnimalManager =>
//  def animalByName(m: String) {
//    log(s"Loading animal $m")
//    getByName(m)
//  }
//}
//
//trait ConsoleLogging extends Logging {
//  def log(msg: String) = println(msg)
//}
//
//trait DBAnimalManager extends H2DAO
//
//
//class DBAnimalService
//  extends DBAnimalManager
//  with ConsoleLogging
//
//// Instantiate Module
//new DBAnimalService
//
//
//object BigInt {
//  def apply(s: String): BigInt =
//    new BigInt(s)
//
//  def apply(i: Int): BigInt =
//    new BigInt(i.toString)
//
//  //...
//  val x = (x: Int) => x + 1
//
//
//
//
//
//}
//
//object FunctionFactory {
//  def adder(x: Int)(y: Int) =
//    x + y
//
//  val inc: Int => Int = adder(1)
//  // or
//  val ident = adder(0)_
//
//  inc(0) == ident(1)
//}
//
//// Scala
//reactions += {
//  case m: MouseEntered =>
//    println("I see it!")
//  case m: MouseExited =>
//    println("Lost it.")
//  case m: MouseClicked =>
//    println("Poked!")
//}
//
//
//sealed trait Tree
//case class Leaf(v: Int) extends Tree
//case class Node(l: Tree, r: Tree) extends Tree
//
//def foreach(t: Tree, f: Int => Unit): Unit =
//  t match {
//    case Node(l, Leaf(v)) =>
//      foreach(l, f)
//      f(v)
//    case Node(Leaf(v), r) =>
//      foreach(r, f)
//      f(v)
//  }
//
//def matchingAnything(a: Any): Any =
//  a match {
//    case 11 => “eleven”
//    case s: String => “’%s’”.format(s)
//    case <tag>{t}</tag> => t
//    case Array(1, 2, 3) => “1, 2, 3”
//    case head :: tail => tail
//    case _ => null
//  }
//
//class User(id: Int) {
//  lazy val followerNum =
//    from(followers)(f =>
//      where(id === f.fid)
//        compute(countDistinct(f.fid))
//    )
//  var debugEnabled = true
//  def veryExpensiveMessage() = true
//  def log(msg: => String) = if (debugEnabled) println(msg)
//
//  log(veryExpensiveMessage())
//
//
//  for (x <- List(1, 2, 3)) yield x * 2
//  // List(1, 2, 3).map(x => x * 2)
//
//  for (x <- List(1, 2); y <- List(1, 2))
//  yield x * y
//  List(1, 2).flatMap(x =>
//    List(1, 2).map(y => x * y)
//  )
//  // List(1, 2, 2, 4)
//
//  def qsort[T <% Ordered[T]](list: List[T]): List[T] = list match {
//    case Nil     => Nil
//    case p :: xs =>
//      val (lesser, greater) = xs partition (_ <= p)
//      qsort(lesser) ++ List(p) ++ qsort(greater)
//  }
//    for {
//      p <- people
//      if p.age > 25
//      s <- schools
//      if p.degree == s.degree
//    } yield (p, s)
//
//    // pairs of people older than 25 and
//    // schools they possibly attended
//
//
//
//
//
//}
//
//
//
//
//
//"A list" should {
//
//  "be a double reverse of itself" in {
//    val ls = List(1, 2, 3, 4, 5, 6)
//    ls.reverse.reverse should equal (ls)
//  }
//
//}
//
//
//
//
//class BigInt(val s: String) {
//  //...
//}
//
//new BigInt("42")
//BigInt("42")
//BigInt(42)
//
//trait Iterator[T] {
//  def next(): T
//
//  def hasNext: Boolean
//
//  def print() {
//    while (hasNext) println(next())
//  }
//}
//
