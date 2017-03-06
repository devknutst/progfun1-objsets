


//
//trait Expr {
//
//  def isNumber: Boolean
//  def isSum: Boolean
//  def numValue: Int
////  def leftOp: Expr
////  def rightOp: Expr
//
//}
//
//case class Number(n: Int) extends Expr {
//
//  def isNumber: Boolean = true
//  def isSum: Boolean = false
//  def numValue: Int = n
////  def leftOp:Expr = throw new Error("")
////  def rightOp:Expr = throw new Error("")
//}
//
////case class Sum(e1: Expr, e2: Expr) extends Expr {
////
////  def isNumber = false
////  def isSum = true
////  def numValue: Int = e1.numValue + e2.numValue
//////  def leftOp: Expr = e1
//////  def rightOp: Expr = e2
////
////}
////
////
////def show(e: Expr): String = e match {
////  case Number(n) => n.toString
////  case Sum(x,y) => x.toString + "," + y.toString
////}
//
////def test(x: Expr): Int = x match {
//////  case Number(x) => 1
//////  case Sum(x,y) => 2
////  case _ => 3
////}

abstract class Term

case class Test(x: Int) extends Term
//
////def test(x: Expr):Int = 1
//
//val x = new Test(2)

Test(1)
2+2
