def polishTime (para:(Int, Int)) : String =
  if para._1 < 0 || para._1 > 23 || para._2 < 0 || para._2 > 59 then throw new Exception(s"Nieprawidlowy czas!")
  else if para._1 == 0 then s"${para._1+12}:${para._2} w nocy"
  else if para._1 <= 4 && para._1 > 0 then  s"${para._1}:${para._2} w nocy"
  else if para._1 <= 12 then s"${para._1}:${para._2} rano"
  else if para._1 <=17 then s"${para._1 - 12}:${para._2} po poludniu"
  else s"${para._1 - 12}:${para._2} wieczorem"




polishTime((5,15))

polishTime((13,20))

polishTime((19,43))

polishTime((1,18))

polishTime((0,30))





polishTime((24,00))

polishTime((22,65))

polishTime((24,65))
