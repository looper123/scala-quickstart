import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}


/**
  * Created by Administrator on 2018/1/31/031.
  */
object IoStream {

  def main(args: Array[String]) {
//    在当前目录下创建一个文本
//    val file = new PrintWriter(new File("1.txt"))
//    file.write("rookie tutorial")
////    关闭流
//    file.close();
//    读取console输入
//    print("请输入rookie tutorial官网地址")
//    val input = StdIn.readLine()
//    println("输入的内容是"+input)

//    读取文件内容
    Source.fromFile("1.txt").foreach{
      print
    };

  }

}
