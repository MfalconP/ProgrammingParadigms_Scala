def find[A] (list:List[A])(elem:A) : Int =
{
  (list, elem) match
  {
    case (Nil, _ ) => 0
    case (h::t, x) if h == x => 1 + find(t)(x)
    case (_::t, x) => find (t)(x)
  }
}

val findNIL = find (List())
findNIL ('a')
findNIL(1)
findNIL(false)
findNIL(2.0)



val find123 = find (List(1,2,3))
find123 (0)
find123 (1)
find123 (3)

//2-a, 2-b, 1-c, ' '-1
val findABCAB = find (List('a','b','c','a','b', ' '))
findABCAB ('a')
findABCAB ('b')
findABCAB ('c')
findABCAB ('q')
findABCAB (' ')


val findSTRING = find (List("abc", " a "))
findSTRING(" a ")
findSTRING("abc")
findSTRING("  a  ")





find (List(1.0,2.0,3.0,3.0)) (3)


//4 true || 3 false'
val findBOOL = find (List(true,false,true,true,false,true,false))
findBOOL (true)
findBOOL (false)


// one - 3 times || three - 2 times
val find1231231 = find (List(1,2,3,1,2,3,1))
find1231231 (1)
find1231231 (3)