enum  ArithmeticExpression:
    case Num(x: Int)
    case Minus(x: ArithmeticExpression)
    case Plus(x: ArithmeticExpression, y: ArithmeticExpression)
    case Mult(x: ArithmeticExpression, y: ArithmeticExpression)
    case Div(x: ArithmeticExpression, y: ArithmeticExpression)
    case Pow(x: ArithmeticExpression, y: ArithmeticExpression)

//Companion-Object &
// its class can access each other’s private members (fields and methods)

object Enums
//recursive invocation of NUM ?
  def evaluate(expression: ArithmeticExpression): Double = expression match
    case ArithmeticExpression.Num(x) => x //x.toDouble ?
    case ArithmeticExpression.Minus(x) => -evaluate(x)  //calls x with evaluate version & negates solution
    case ArithmeticExpression.Plus(x,y) => evaluate(x) + evaluate(y)
    case ArithmeticExpression.Mult(x,y) => evaluate(x) * evaluate(y)
    case ArithmeticExpression.Div(x,y)  => evaluate(x) / evaluate(y)
    case ArithmeticExpression.Pow(x,y)  => Math.pow(evaluate(x), evaluate(y))

//Bring the given arithmetic expression into a human-readable format in infix notation
//STRING INTERPOLATION
  def pretty(expression: ArithmeticExpression): String = expression match
    case ArithmeticExpression.Num(x) => s"${ArithmeticExpression.Num(x)}"
    case ArithmeticExpression.Minus(x) => s"-${pretty(x)}"
    case ArithmeticExpression.Plus(x,y) => s"${pretty(x)} + ${pretty(y)}"
    case ArithmeticExpression.Mult(x,y) => s"${pretty(x)} * ${pretty(y)}"
    case ArithmeticExpression.Div(x,y) => s"${pretty(x)} / ${pretty(y)}"
    case ArithmeticExpression.Pow(x,y) => s"${Math.pow(pretty(x).toDouble, pretty(y).toDouble)}"

//println(s"$name is $age years old")