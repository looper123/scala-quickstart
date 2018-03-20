/**
  * Created by Administrator on 2018/1/26/026.
  */

import java.util.Date
import Array._
import java.io._

object FunctionInvoke {


  def delayed(t: => Long) = {
    println("在 delayed 方法内")
    println("参数： " + t)
    t
  }

  def time() = {
    println("获取时间，单位为纳秒")
    System.nanoTime
  }

  def printString(args: String*): Unit = {
    var i: Int = 0;
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg);
      i = i + 1;
    }
  }

  def addInt(a: Int = 5, b: Int = 7): Int = {
    return a + b;
  }

  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  def log(date: Date, message: String) = {
    println(date + "----" + message)
  }

  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString + "]"

  def main(args: Array[String]) {

    //传名调用 在delayed（）方法内部 执行time（）方法  每次执行delayed方法时候都会执行以下time()方法
    //    delayed(time());

    //可变参数
    //    printString("java","python","scala");

    //    默认参数 (如果不传参数 会使用默认值  如果传了参数 则使用参数)
    //    println( "返回值 : " + addInt(10,12) );

    //内嵌函数 定义在函数内部的函数
    //    println(factorial(0))

    //    偏应用函数
    //    val date = new Date
    //绑定第一个参数  第二个使用 _ 下划线替换确实的参数列表
    //    val logWithDateBound = log(date, _: String)
    //    logWithDateBound("message1")

    //    闭包函数  函数的返回值依赖于 申明在函数外部的一个或者让多个变量
    //    var factor = 3
    // 这时候的 multiplier 相当于一个函数 而不是常量
    //    val multiplier = (i: Int) => i * factor
    //    println("multiplier="+multiplier(1))

    //    scala 可以在调用函数的时候指定函数的内部参数名 来改变参数传递顺序
    //    val c = addInt(b = 19, a = 20);
    //    println("c =" + c)


    //   递归函数 （计算1 - 10 的阶乘）
    //    for (i <- 1 to 10) {
    //      println(i + " 的阶乘为: = " + factorial(i));
    //    }

    //    高阶函数 使用其他函数作为参数 或者使用函数作为返回结果
    //    println( apply( layout, 10) )

    //    匿名函数
    //    var inc = (x: Int) => x + 1
    //    /**
    //      * 以上 等同于 def add2 = new Function1[Int,Int]{
    //      * def apply(x:Int):Int = x+1;
    //      * }
    //      */
    //    var x = inc(7) - 1
    //    println("x=" + x)
    ////    不给匿名函数设置参数
    //    var useDir =() => { System.getProperty("user.dir")}
    //    print(useDir())


    //    函数柯里化 输出结果相同
    //    println(origin(1,2))
    //    println(currying(1)(2)) //实际上依次调用两个普通函数（非柯里化函数），第一次调用使用一个参数 x，返回一个函数类型的值，第二次使用参数y调用这个函数类型的值。


    //    在scala中 string 类型是不可变的(因为使用的是java.lang.String  所以节本特征和java一样)
    //    val str = "helloworld"
    //    print(str)

    //      var s = new StringBuilder;
    //      s += 'a'  //+= 后面一定要是 单引号
    //      s ++= "bc"  // ++= 后面一定是双引号
    //      print(s.toString )
    //    todo
    //    数组

    //    数组的申明
    //    var z = new Array[String](3)
    //    z(0) = "Runoob";
    //    z(1) = "Baidu";
    //    z(4 / 2) = "Google"
    //    //或者
    //    var z_copy = Array("Runoob","Baidu","Google");

    //    数组的循环
    //    for (i <- 0 to(z_copy.length-1)){
    //      println(z_copy(i));
    //    }

    //    多维数组
    //    var myMatrix = ofDim[Int](3,3)
    ////    放入元素
    //    for(i<- 0 to(2)){
    //      for (j<- 0 to 2){
    //        myMatrix(i)(j)=i+j;
    //      }
    //    }
    ////    打印二维数组
    //    for (i<-0 to(2)){
    //      for (j<-0 to(2)){
    //        println(myMatrix(i)(j));
    //      }
    //    }

    //    数组的合并
    //    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    //    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    //    var myList3 = concat(myList1,myList2);
    //    for (i <-0 to( myList3.length)){
    //      println(i)
    //    }

    //    区间数组
    //    var myList1 = range(10, 20, 2)
    //    var myList2 = range(10,20)
    //    // 输出所有数组元素
    //    for ( x <- myList1 ) {
    //      print( " " + x )
    //    }
    //    println()
    //    for ( x <- myList2 ) {
    //      print( " " + x )
    //    }

    //    scala集合 类型： 列表 List   集合 Set 映射 Map  元组 （不同类型的值集合）  Option(容器内可能包含值也可能不包含值)  Iterator 迭代器
    //    var list: List[Int] = List(1, 2, 3, 4);
    //    //    空列表
    //    var empty: List[Nothing] = List();
    //    //   二维列表
    //    val dim: List[List[Int]] =
    //      List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1));
    //    //  其他定义列表的方法 ::和Nil是定义列表的基本元素
    //    var site = "Runoob" :: ("google" :: ("baidu" :: Nil));
    //    //空列表
    //    var empty_1 = Nil;
    //    //  列表的连接
    //    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    //    val site2 = "Facebook" :: ("Taobao" :: Nil)
    //    val merge = site1 ::: site2;
    //    val merge_1 = site1.:::(site2);
    //    val merge_2 = List.concat(site1,site2);
    //    创建指定重复元素的列表
    //    val list_repeat = List.fill(3)("Runoob");
    //    //    通过指定的函数创建列表
    //    val duplicate = List.tabulate(5)(n => n * n);
    //    //    反转列表
    //    val reverse = duplicate.reverse;
    //    for (i <- 0 to (reverse.size - 1)) {
    //      print(reverse(i));
    //    }
    //    //    为列表添加元素
    //    val reverse_1 = 100 +: reverse:+ 100;
    //    println(reverse_1)

    // 在需要用到可变集合的地方引入
    //    import scala.collection.mutable.Set
    //    var set = Set(1, 2, 3, 3, 2);
    //    println(set.getClass.getName)
    //    set.add(5)
    //    println(set)
    //    println(set.toSet.getClass.getName);
    //    set集合的拼接
    //    val site1 = Set("Runoob", "Google", "Baidu")
    //    val site2 = Set("Faceboook", "Taobao","Runoob")
    //    val site3 = site1 ++ site2;
    //    val site4 = site1.++(site2);
    //    println(site3)
    //    println(site4)
    //    交集
    //    println(site1.intersect(site2))
    //    println(site1.&(site2))


    //    map 映射 也有两种类型 可变与不可变 默认不可变
    //    初始化空map
    //    var myMap: Map[Char, Int] = Map();
    //    myMap += ('I' -> 1)
    //    myMap += ('J' -> 2)
    //    myMap += ('K' -> 4)
    //    myMap += ('L' -> 5)
    //    //   在map和 里面键值对一起初始化
    //    val myMap_1: Map[String, String] = Map("red" -> "#FF0000", "azure" -> "#F0FFFF");
    //    // map的合并
    //    val colors1 = Map("red" -> "#FF0000",
    //      "azure" -> "#F0FFFF",
    //      "peru" -> "#CD853F")
    //    val colors2 = Map("blue" -> "#0033FF",
    //      "yellow" -> "#FFFF00",
    //      "red" -> "#FF0000")
    //    println(colors1 ++ colors2);
    //    println(colors1.++(colors2))

    //map的迭代
    import scala.collection.mutable.Map;
    var sites = Map("runoob" -> "http://www.runoob.com",
      "baidu" -> "http://www.baidu.com",
      "taobao" -> "http://www.taobao.com")
    //    sites.keys.foreach{ i=>
    //      print( "Key = " + i )
    //      println(" Value = " + sites(i) )}
    var sites_copy = sites.clone()
//    println(sites_copy)
//    重新转化为可变集合
//    sites.toMap

    //    Iterator迭代器 访问集合的方法
    val it = Iterator("Baidu", "Google", "Runoob", "Taobao")
//    不能同时访问最大和最小元素
//    println(it.max);
    println(it.min);
    while(it.hasNext){
      println(it.next())
    }





  }


  def origin(a: Int, b: Int) = a + b

  def currying(a: Int)(b: Int) = a + b

//  继承关系
//  基类
class Point(val xc: Int,val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("x 的坐标点: " + x);
    println ("y 的坐标点: " + y);
  }
}

//  子类  （只允许继承一个父类）
//  当前子类重写了 父类的xc 和yc属性
  class Location(override val xc: Int, override val yc: Int,
                 val zc :Int) extends Point(xc, yc){
    var z: Int = zc

//  如果要重写move方法 需要在前面加上override 关键词
    def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("x 的坐标点 : " + x);
      println ("y 的坐标点 : " + y);
      println ("z 的坐标点 : " + z);
    }
  }


}
