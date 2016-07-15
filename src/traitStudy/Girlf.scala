package traitStudy

class Girlf(override val name:String) extends Human(name) with Friend {
  
  override def sayHello()= println("这里重写sayHello的方法")
  
}