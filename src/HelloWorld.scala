// 重命名成员(把 java包中的hashmap 重命名为JavaHashMap)
import java.util.{HashMap => JavaHashMap}
import java.util.{HashMap => _, _}

//导入java util下的所有包 隐藏HashMap包


/**
  * scala 语法 (基本和java语法一致)
  * 区分大小写 -  Scala是大小写敏感的，这意味着标识Hello 和 hello在Scala中会有不同的含义。
  * 类名 - 对于所有的类名的第一个字母要大写。
  * 如果需要使用几个单词来构成一个类的名称，每个单词的第一个字母要大写。
  * 示例：class MyFirstScalaClass

  * 方法名称 - 所有的方法名称的第一个字母用小写。
  * 如果若干单词被用于构成方法的名称，则每个单词的第一个字母应大写。
  * 示例：def myMethodName()

  * 程序文件名 - 程序文件的名称应该与对象名称完全匹配。
  * 保存文件时，应该保存它使用的对象名称（记住Scala是区分大小写），并追加".scala"为文件扩展名。 （如果文件名和对象名称不匹配，程序将无法编译）。
  * 示例: 假设"HelloWorld"是对象的名称。那么该文件应保存为'HelloWorld.scala"
  * def main(args: Array[String]) - Scala程序从main()方法开始处理，这是每一个Scala程序的强制程序入口部分。
  *
  */


object HelloWorld {
  /* 这是我的第一个 Scala 程序
   * 以下程序将输出'Hello World!'
   */
  def main(args: Array[String]) {
    //    多行字符串用 """   """ 来连接 （和python 一样）
    //    在变量或者常量初始化的时候 如果没有指定类型 必须要给它初始化一个值（程序通过初始值来判断其类型） 否则程序报错
    var foor, foor2 = "foor";
    // var 定义变量 可以被修改
    val fool, fool2 = "fool"; // val定义常量 常量无法被修改

    val s = "菜鸟教程";
    println(
      """菜鸟教程时
            www.runoob.com
            www.w3cschool.cc
            www.runnoob.com
            以上三个地址都能访问""") // 输出 Hello World

  }


  //  在scala中 private修饰的对象/类  外部类无法访问内部类的私有成员  内部类可以访问 （而java是内部类外部类都能访问私有成员）
  class Outer {
    class Inner {
      //      private[x]  中的x表示某个所属的包、类或者单例对象   整体表示这个成员除了对[…]中的类或[…]中的包中的类及它们的伴生
      // 对像可见外，对其它所有类都是private。

      private def f() {
        println("f")
      }
      class InnerMost {
        f() // 正确
      }
    }
    //    (new Inner).f() //错误
  }

  // scala 中的protect修饰的成员 只能被该类的子类中被访问 （java中 只需要同一个包中就可以）
  class Super {
    protected def f() {
      println("f")
    }
  }

  class Sub extends Super {
    f()
  }

  class Other {
    //    (new Super).f() //错误
  }


//  def functionName ([参数列表]) : [return type] = { 方法主体}  如果最后不跟"=" 号和方法体  该方法会被默认为一个abstract方法
//  当返回类型为空时  return type 可以用Unit （相当于java的void）替换

}