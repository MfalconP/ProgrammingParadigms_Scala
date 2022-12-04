def insert[A] (list:List[A]) (elem:A) (pos:Int): List[A] = {
  list match
  {
    case Nil           =>    elem::Nil
    case _ if pos<=0   =>    elem::list
    case   h::t        =>    h::insert(t)(elem)(pos-1)
  }
}




val insL = insert (List(1,2,3,4,5))

insL (6) (0)
insL (6) (-10)
insL (6) (20)
insL (6) (3)
insL (6) (5)


insert(Nil)(1)(10)



val insA = insert(List("b","c"))

insA ("a") (0)
insA ("d") (10)

insert(List (true,false,true)) (false) (4)

insert(List (1.1,2.2)) (0.0) (-10)