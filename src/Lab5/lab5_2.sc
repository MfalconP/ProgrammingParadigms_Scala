import scala.annotation.tailrec

def lazyListToListByAmount[A](llist: LazyList[A], amount: Int): List[A] = {
  (llist, amount) match {
    case (LazyList(), _) => List()
    case (lh #:: _, 1) => List(lh)
    case (lh #:: lt, n) => lh :: lazyListToListByAmount(lt, n - 1)
  }
}


def sublistsL[A](llist: LazyList[A]): LazyList[List[A]] = {
  def subListsHelp[A](llist: LazyList[A], iteration: Int, iteratedLazyList: LazyList[A]): LazyList[List[A]] = {
    (llist, iteration, iteratedLazyList) match {
      case (_, _, LazyList()) => LazyList()
      case (llist, n, _ #:: lti) => lazyListToListByAmount(llist, n) #:: subListsHelp(llist, n+1, lti)
    }
  }
  subListsHelp(llist, 1, llist)
}


sublistsL(LazyList(1,2,3,4,5,6,7,8,9,10))
sublistsL(LazyList(1,2,3,4,5,6,7,8,9,10)).toList
sublistsL(LazyList()).toList
sublistsL(LazyList('a','b','c','d','e', 'f', 'g')).toList

sublistsL(LazyList.from(0)).take(10).force
