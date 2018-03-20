import java.io.{FileNotFoundException, FileReader}

import scala.util.matching.Regex

/**
  * Created by Administrator on 2018/1/31/031.
  */
object ScalaPattern {

  def main(args: Array[String]) {
//    //    构造regex对象
//    val pattern = "Scala".r
//    //    匹配的时候不区分大小写
//    val pattern2 = new Regex("(s|S)cala")
//    val str = "Scala is a cool language"
//    println(pattern2 findFirstIn (str))
//
//    try {
//      val reader = new FileReader("1.txt")
//    } catch {
//      case ex:FileNotFoundException =>{
//        println("file not find")
//      }
//    };
//    scala提取器 extractor
    println ("Apply 方法 : " + apply("Zara", "gmail.com"));
    println ("Unapply 方法 : " + unapply("Zara@gmail.com"));
    println ("Unapply 方法 : " + unapply("Zara Ali"));

  }

  def apply(user:String,email:String)= {
    user+"@"+email;
  }

  def unapply(str:String) :Option[(String,String)]={
    val parts = str split("@");
    if(parts.length == 2){
      Some(parts(0),parts(1));
    }else {
      None;
    }
  }

}
