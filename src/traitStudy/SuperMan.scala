package traitStudy

/**
 * 测试trait的部分混入，需要的的时候才给混入进去(创建实例的时候 使用with混入)
 * 
 */

class SuperMan(override val name:String) extends Human(name) {
  
  def show(f:Friend) = {
    f.sayHello
  }
}

object testSuperMan{
  def main(args: Array[String]): Unit = {
  val A=  new SuperMan("superMan")
  //这里会直接发生错误。。。因为A和superMan并没有什么直接的关系
 //   val f:Friend=A;
      val B=  new SuperMan("superMan") with Friend
      val ff:Friend=B
      B.show(ff)   
    //执行结果
    //superMan---is saying----来自friend
  }
}

