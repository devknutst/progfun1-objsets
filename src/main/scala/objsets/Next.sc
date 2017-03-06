


def insert(x: Int, xs: List[Int]): List[Int] = xs match {

  case List() => xs.::(x)
  case y :: ys => if (x>y) (x :: (y:: ys)) else y :: insert(x, ys)
}


