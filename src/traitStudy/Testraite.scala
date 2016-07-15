

/**
 * 测试两种使用trait的方式以及不使用trait的区别
 */


package traitStudy

object testraite {

  
  def main(args: Array[String]): Unit = {
    //没有 使用trait
     new man("xxx").sayHello1()
    //使用 继承的方式使用 trait
     new man2("yyy") sayHello;
   //     使用with方式使用trait
     new Girlf("zzz") sayHello
  }
//执行结果 
//  xxx------ is saying
//  yyy---is saying----来自friend
//  这里重写sayHello的方法

}