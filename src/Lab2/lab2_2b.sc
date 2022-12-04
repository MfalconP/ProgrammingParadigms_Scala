import scala.annotation.tailrec

def split3Tail[A](list: List[A]) =
{
  @tailrec
  def split3TailRec(list: List[A], l1: List[A], l2: List[A], l3: List[A]): (List[A], List[A], List[A]) = list match
      case e1 :: e2 :: e3 :: t      =>      split3TailRec(t, e1 :: l1, e2 :: l2, e3 :: l3)
      case          _               =>      (l1, l2, l3)

  split3TailRec(list, Nil, Nil, Nil)

}


split3Tail (List())

split3Tail (List(1,2,3,4,5,6,7,8,9))

split3Tail (List(true,false,false))

split3Tail (List("Ala", "ma", "kota", "dużego"))

split3Tail (List(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0))

split3Tail (List(1))

split3Tail (List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'))
