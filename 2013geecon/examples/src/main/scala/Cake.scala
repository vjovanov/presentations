
/*trait Builder {
  def builder
}

trait Iterable[T] { this: Builder => 
  def foreach(x: T => Unit)

  def map[U](f: T => U) = {
  	val b = builder
  	foreach { x => b += f(x) }
  	v.toIterable
  }

  def filter(p: T => Boolean) = {
  	val b = builder
    foreach { x => if (p(x)) b += x}
    v.toIterable
  }
  // 40 more methods
}*/

// TODO example for scalable components that will need abstract types