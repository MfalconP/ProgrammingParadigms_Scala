def split3Rec[A](list: List[A]): (List[A], List[A], List[A]) =
{
   list match
   {
     case e1 :: e2 :: e3 :: t              =>
       val (l1, l2, l3) = split3Rec(t)
       (e1 :: l1, e2 :: l2, e3 :: l3)
     case           _                      =>      (Nil, Nil, Nil)
   }
}


split3Rec (List())

split3Rec (List(1,2,3,4,5,6,7,8,9))

split3Rec(List(true,false,false))

split3Rec(List("Ala", "ma", "kota", "dużego"))

split3Rec(List(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0))

split3Rec (List(1))

split3Rec (List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'))