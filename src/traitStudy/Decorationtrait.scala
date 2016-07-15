package traitStudy
/**
 * trait 装饰练习  也就是一层层的叠加。顺序自由 和设计模式的装饰着模式有点类似  执行顺序从右到左
 * override 空参的方法，，括号必须写  这里的 Decorationtrait show()方法的括号必须写
 * 抽象类不能new 加了trait就可以 new
 * 
 */
abstract class Decorationtrait {
def show()=println("最基本的展示-----")
  
}

trait A extends Decorationtrait{
  override def show() ={println("AAAAAAAAAAAAA")
   super.show();
  }
}

trait B extends Decorationtrait{
  override def show() ={println("BBBBBBBBB")
   super.show();}
}
trait C extends Decorationtrait{
  override def show() ={
    println("CCCCCCCCCCCC");
    super.show();
  }
}

object testDecorationtrait{
  def main(args: Array[String]): Unit = {
    //抽象类是不能直接new 必须加trait才可以new
  val d1=    new Decorationtrait() with A with B with C
  
  d1.show();
 // 执行结果
//CCCCCCCCCCCC
//BBBBBBBBB
//AAAAAAAAAAAAA
//最基本的展示-----
  
  }
  
}