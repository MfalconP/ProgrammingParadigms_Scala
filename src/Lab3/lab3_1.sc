//proszę 20 PKT ZA TEN FAJNY PROGRAM -_0
def decode [A](x:A)(fs: List[A => A]): List[A] =
  {
    fs match
      case Nil => Nil
      case _ =>
        val h::_ = for (f<-fs) yield f(x)
        h::decode(h)(fs.tail)
  }




//METODA BEZ FOR'A
//def decode1 [A](x: A) (fs: List[A => A]): List[A] =
//{
//  fs match
//    case Nil => Nil
//    case f::ft => f(x)::decode1(f(x)) (ft)
//}
//
//decode1 (5) (List(twice, sqr, thr))


//METODA Z FOR'EM W DWÓCH MIEJSCACH (ZŁOŻONOŚĆ ++)
//def decode [A](x:A)(fs: List[A => A]): List[A] =
//{
//  if fs == Nil then Nil
//  else
//    (for (f<-fs) yield f(x)).head::decode((for (f<-fs) yield f(x)).head)(fs.tail)
//}


//DEFAULT TEST NA INT'ACH
val twice = (x:Int) => 2*x
val sqr = (x:Int) => x*x
val thr = (x:Int) => x+x+x
val zero = (x:Int) => x * 0
val plus = (x:Int) => x+1

decode (5) (List(twice, sqr, thr, zero, plus))


//TEST NA PUSTĄ LISTĘ, NIE MOŻE BYĆ ŻE DZIAŁA O_o
decode (5) (List())


//TEST NA STRING'ACH, NO TEN NA 100% NIE ZADZIAŁA!
val addHave = (s:String) => s + " ma "
val addCat = (s:String) => s + " kota "
val addFalse = (s:String) => s + " (nieprawda, nie ma) "
val addSadFace = (s:String) => s + " :-( "

decode ("Ala ") (List(addHave, addCat, addFalse, addSadFace))


//FINAL TEST NA DOUBLE, PO DZIAŁANIU STRING JUŻ WIERZĘ W TEN PROGRAM
val d1 = (d:Double) => d * 2
val d2 = (d:Double) => d / 5
val d3 = (d:Double) => d*d
val d4 = (d:Double) => d * -1

decode (1.5) (List(d1, d2, d3, d4))
//NO I DZIAŁA :-) <3


