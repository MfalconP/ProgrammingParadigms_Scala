//Inicjalizacja typu fabryki
sealed trait Factory
case class Final_Machine(time:Int) extends Factory
case class Machine (time:Int, next:List[Factory]) extends Factory


//def getTime (machine:Factory) =
//  machine match
//    case Machine(t,_) => t
//    case Final_Machine(ft) => ft
//
//
//def calc (time:Int, mList:List[Factory], listRest:List[Factory], q:Int, firstMachineTime:Int): List[Int] = mList match
//  case Nil => Nil
//  case Machine(t, ms)::r => calc(q*time+t, ms, r, q, firstMachineTime)
//  case Final_Machine(t)::r => time+t::calc(firstMachineTime, listRest, r, q+1, firstMachineTime)
//
//
//
//def productionTime (fact:List[Factory]) = calc(0, fact, Nil, 1, getTime (fact.head)).max



//Metoda, obliczajaca czasy wszystkich drog do koncowej maszyny
def timesFromDifRoutes (factL:List[Factory], time:Int): List[Int] =
{
  factL match
    case Nil => Nil
    case Machine(t, ms)::r => timesFromDifRoutes(ms, time+t) ::: timesFromDifRoutes(r, time)
    case Final_Machine(t)::r => time+t::timesFromDifRoutes(r, time)
}


//metoda, wybierajaca najdluzsza droge do koncowej maszyny. Najdluzsza, bo maszyna musi zaczekac cale jej wejscie
def productionTime (factL: List[Factory]) = timesFromDifRoutes(factL, 0).max




//Przyklad test1.png
val test1 = List(Machine(5,List(Machine(8,List(Final_Machine(10))), Machine(12,List(Final_Machine(10))), Machine(9, List(Final_Machine(10))))))

//Przyklad test2.png
val test2 = List(Machine(3, List(Machine(4, List(Final_Machine(8))), Machine(6, List(Final_Machine(8))))))

//Przyklad test3.png
val test3 = List(Machine(3,List(Machine(4,List(Machine(3, List(Final_Machine(10))))), Machine(5, List(Machine(3,List(Final_Machine(10))), Machine(8, List(Final_Machine(10))))), Machine(6, List(Machine(8, List(Final_Machine(10))))))))

//Tylko jedna maszyna
val test4 = List(Final_Machine(15))

//Maszyna (20) -> Maszyna (3)
val test5 = List(Machine(20, List(Final_Machine(3))))


productionTime(test1)

productionTime(test2)

productionTime(test3)

productionTime(test4)

productionTime(test5)