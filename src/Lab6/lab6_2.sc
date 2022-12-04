def pascalCascadeI(n: Int): Array[Int] = {
  if n < 1 then
  {
    throw new Exception("There is no such line in pascal cascade")
  }else
    {
      var i = 1
      var arr1 = Array(1)

      while i < n do
        var arr2 = new Array[Int](i + 1)
        arr2(0) = 1


        var l = 1
        while l <= i-1 do
          arr2(l) = arr2(l-1) + arr1(l)
          l = l + 1
        end while

        arr2(i) = arr2(i-1)

        arr1 = arr2

        i = i + 1
      end while
      arr1
    }
}



pascalCascadeI(1)
pascalCascadeI(2)
pascalCascadeI(3)
pascalCascadeI(4)
pascalCascadeI(5)
pascalCascadeI(6)

pascalCascadeI(10)

pascalCascadeI(0)
pascalCascadeI(-10)




