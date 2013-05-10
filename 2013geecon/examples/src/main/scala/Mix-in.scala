trait Graph {
  type Node[T]

  var nodes = List[Node[_]]
  
  def insert(t: Node[T]) = nodes += t
}



// Adding abstract types