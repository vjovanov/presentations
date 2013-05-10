// Needs to associate to type transformations

// virtualize macro
def virtualize[T](c: Context)(b: => c.Expr[T]): c.Expr[T] = {

}