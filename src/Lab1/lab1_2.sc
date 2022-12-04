def difference [A](l1:List [A],l2:List [A]) : Int =
  if l1 == Nil && l2 == Nil then 0
  else if l1 == Nil then 1+difference(l1, l2.tail)
  else if l2 == Nil then 1+difference(l1.tail, l2)
  else if l1.head == l2.head then difference(l1.tail, l2.tail)
  else 1+difference(l1.tail, l2.tail)


val list1 = 1::1::2::4::Nil
val list2 = 1::1::2::3::8::9::9::Nil

val list3 = 1::1::1::1::Nil
val list4 = 1::1::1::1::Nil

val list5 = "a"::"b"::"c"::"d"::Nil
val list6 = "a"::"a"::"c"::"a"::Nil

val list7 = 1.0::2.0::3.0::4.0::Nil
val list8 = 1.0::1.0::2.0::3.0::8.0::9.0::9.0::Nil

val list9 = true::true::false::true::Nil
val list10 = true::true::false::false::Nil

difference(list1, list2)
difference (list2, list1)
difference(list3, list4)
difference(list5, list6)
difference(list7, list8)
difference(list9, list10)