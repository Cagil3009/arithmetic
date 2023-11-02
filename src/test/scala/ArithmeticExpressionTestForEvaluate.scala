import ArithmeticExpression.Num
import ArithmeticExpression.Minus
import ArithmeticExpression.Plus
import ArithmeticExpression.Mult
import ArithmeticExpression.Div
import org.scalatest.funsuite.AnyFunSuite

class ArithmeticExpressionTestForEvaluate extends AnyFunSuite {
  // val test = new ArithmeticExpressionTest
  //test.assert(ArithmeticExpression.Num(x = 4) === 4)

  test("NumTestE"){
    assert(evaluate(ArithmeticExpression.Num(x = 0)) === 0)
    assert(evaluate(ArithmeticExpression.Num(x = 4)) === 4)
    assert(evaluate(ArithmeticExpression.Num(x = -4)) === -4)
  }
  test("MinusTestE"){
    assert(evaluate(ArithmeticExpression.Minus(x = Num(0))) === 0)
    assert(evaluate(ArithmeticExpression.Minus(x = Num(4))) === -4)
    assert(evaluate(ArithmeticExpression.Minus(x = Num(-4))) === -(-4))
  }

  test("PlusTestE"){
    assert(evaluate(ArithmeticExpression.Plus(x = Num(0), y = Num(0))) === 0)
    assert(evaluate(ArithmeticExpression.Plus(x = Num(0), y = Num(4))) === 4)
    assert(evaluate(ArithmeticExpression.Plus(x = Num(0), y = Num(-4))) === -4)
  }

  test("MultTestE"){
    //Test x = y = 0 doesn't work
    assert(evaluate(ArithmeticExpression.Mult(x = Num(0), y = Num(0))) === 0)
    assert(evaluate(ArithmeticExpression.Mult(x = Num(0), y = Num(4))) === 0)
    assert(evaluate(ArithmeticExpression.Mult(x = Num(2), y = Num(2))) === 4)
    assert(evaluate(ArithmeticExpression.Mult(x = Num(-2), y = Num(2))) === -4)
  }

  test("DivTestE"){
    assert(evaluate(ArithmeticExpression.Div(x = Num(0), y = Num(0))) === 0)
    assert(evaluate(ArithmeticExpression.Div(x = Num(4), y = Num(2))) === 2)
    assert(evaluate(ArithmeticExpression.Div(x = Num(-4), y = Num(2))) === -2)
    assert(evaluate(ArithmeticExpression.Div(x = Num(-4), Num(-2))) === 2)
  }

  test("PowTestE"){
    assert(evaluate(ArithmeticExpression.Pow(x = Num(0), y = Num(0))) === 1)
    assert(evaluate(ArithmeticExpression.Pow(x = Num(2), y = Num(2))) === 4)
    assert(evaluate(ArithmeticExpression.Pow(x= Num(2), y= Num(-2))) === 0.25)
  }
}
