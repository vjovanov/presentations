
import language.experimental.macros
import scala.reflect.macros.Context

// Intro Slide about macros

object Asserts {
  def raise(msg: Any) = throw new AssertionError(msg)
  def assertImpl(c: Context)
    (cond: c.Expr[Boolean], msg: c.Expr[Any]) : c.Expr[Unit] = {
    import c.universe._
   c.Expr(if (System.getenv.get("USE_ASSERTS").toBoolean)
      q"if (!$cond) Asserts.raise($msg)"
      else
      q"()")
    }
}


// virtualize macro
object Language {

  def virtualize[T](block: => T): T =
    macro Impl.virtualize[T]

  object Impl {
    def virtualize[T](c: Context)(block: c.Expr[T]): c.Expr[T] = {
      import c.universe._
      c.Expr(new Transformer {
        override def transform(t: Tree) = t match {
          case q"if($c) $t then $e" =>
            q"__ifThenElse(${super.transform(c)}, ${super.transform(t)}, ${super.transform(e)})"
          case q"while($c) $b" =>
            q"__whileDo(${super.transform(c)}, ${super.transform(b)})"
      }}.transform(block.tree))
    }
  }
}
