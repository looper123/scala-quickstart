/**
  * Created by Administrator on 2018/1/30/030.
  */


//私有化构造
class Marker private(val color:String) {
// this 表示当前对象
  println("创建" + this)

  override def toString(): String = "颜色标记："+ color

}

// 伴生对象，与类共享名字，可以访问类的私有属性和方法
object Marker{

  private val markers: Map[String, Marker] = Map(
//    调用伴生类的构造
    "red" -> new Marker("red"), //创建颜色标记：red
    "blue" -> new Marker("blue"), //创建颜色标记：blue
    "green" -> new Marker("green") //创建颜色标记：green
  )

//  apply方法让我们不需要new 操作就可以创建对象  （比如创建Maker对象 可以使用 Maker(参数)  来创建一个Maker对象）
  def apply(color:String) = {
    if(markers.contains(color)) markers(color) else null
  }


  def getMarker(color:String) = {
    if(markers.contains(color)) markers(color) else null
  }
  def main(args: Array[String]) {
//    执行了apply 方法  当操作了String 类型后 会调用父类重写了的toString方法
    println(Marker("red"))  //颜色标记：red
//    执行了getMaker 方法
    // 单例函数调用，省略了.(点)符号
    println(Marker getMarker "blue")   //颜色标记：blue
  }
}
