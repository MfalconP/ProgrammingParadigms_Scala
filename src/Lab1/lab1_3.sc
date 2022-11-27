def insert [A](l1: List[A], x:A, n:Int) : List[A] =
  if n<0 then x::l1
  else if l1 == Nil then x::Nil
  else if n == 0 then x::l1
  else l1.head::insert(l1.tail, x, n-1)


val list = List (1,2,3,4,5)




insert(list, 6, 0)
insert(list, 6, -10)
insert(list, 6, 20)
insert(list, 6, 3)
insert(list, 6, 5)


insert(Nil,1,10)

insert(List ("b","c"), "a", 0)

insert(List ("b","c"), "d", 10)

insert(List (true,false,true), false, 4)

insert(List (1.1,2.2), 0.0, -10)

