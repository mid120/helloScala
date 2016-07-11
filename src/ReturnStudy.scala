

object ReturnStudy {

 def main(args: Array[String]): Unit = {
    print(test1())
 //    print(test2())
  }
  def test1()=true
  //如果写了return 就少了推演数据类型的能力。这里报错是应为没有返回值类型
 // def test2()=return true
 
}