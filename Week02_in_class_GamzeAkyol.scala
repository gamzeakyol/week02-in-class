def size(list: List[Any]): Any = {
			
	def sizeHelper(list: List[Any], acc: Int): Any = list match {
		case h::tail => sizeHelper(tail, acc+1)
		case Nil => acc 	
	}
	sizeHelper(list, 0)
}


def reverse(list: List[Any]): List[Any] = list match{
	case Nil => Nil
	case h::tail => reverse(tail):::List(h)
}


def last(list: List[Any]): Any = list match {
	case Nil => Nil
	case h::Nil => h
	case h::tail => last(tail)
}


val x = List(1, 2, 3)

size(x)
reverse(x)
last(x)
