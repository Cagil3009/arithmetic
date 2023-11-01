import org.scalatest.funsuite.AnyFunSuite
//import org.scalatest._
class ArithmeticExpressionForPretty extends AnyFunSuite {
  test("NumTestP"){
    assert(pretty(ArithmeticExpression.Num(4)) === "4")
  }

  test("MinusTestP"){
    assert(pretty(ArithmeticExpression.Minus(x = ArithmeticExpression.Num(4))) === "-4")
    //assert(pretty(ArithmeticExpression.Minus(x = Num(4))) === "-4")
    //assert(pretty(ArithmeticExpression.Minus(x = 4)) === "-4")
  }

  test("PlusTestP"){
    assert(pretty(ArithmeticExpression.Plus(x = ArithmeticExpression.Num(1), y = ArithmeticExpression.Num(4))) === "5")
  }

  test("MultTestP"){
    assert(pretty(ArithmeticExpression.Mult(x = ArithmeticExpression.Num(1), y = ArithmeticExpression.Num(4))) === "4")
  }

  test("DivTestP"){
    assert(pretty(ArithmeticExpression.Div(x = ArithmeticExpression.Num(4), y = ArithmeticExpression.Num(1))) === "4")
  }
}
