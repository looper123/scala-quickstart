/**
  * Created by Administrator on 2018/1/31/031.
  */
trait Equal {

  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = isEqual(x)

}

class Point(xc: Int, yc: Int) extends Equal {

  var x: Int = xc
  var y: Int = yc

  //    重写没有具体实现的方法
  override def isEqual(x: Any) =
    x.isInstanceOf[Point] &&
      x.asInstanceOf[Point].x == x
}

object Test {
  def main(args: Array[String]) {
    //    val p1 = new Point(2, 3)
    //    val p2 = new Point(2, 4)
    //    val p3 = new Point(3, 3)
    //
    //    println(p1.isNotEqual(p2))
    //    println(p1.isNotEqual(p3))
    //    println(p1.isNotEqual(2))
//      println( matchTest(2));

    val alice = new Person("Alice", 25)
    val bob = new Person("Bob", 32)
    val charlie = new Person("Charlie", 32)

    for (persion <- List(alice,bob,charlie)){
      persion match {
        case Person("Alice", 25)=> println("hello Alice")
        case Person("Bob", 32)=> println("hello Bob")
        case Person(name,age)=> println("name="+name+"&age="+age)
      }
    }
  }


  def matchTest(x: Any) :Any = x  match{
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
  }

// 样例类  用于match  case的 条件
  case class Person(name:String,age:Int){

  }

}
