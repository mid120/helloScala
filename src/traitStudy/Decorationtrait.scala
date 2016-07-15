package traitStudy
/**
 * trait 装饰练习  也就是一层层的叠加。顺序自由 和设计模式的装饰着模式有点类似  执行顺序从右到左
 * override 空参的方法，，括号必须写  这里的 Decorationtrait show()方法的括号必须写
 * 抽象类不能new 加了trait就可以 new
 * 
 */
abstract class Decorationtrait {
def show()=println("最基本的展示-----")
def say()=println("say方法-----");
  
}

trait A extends Decorationtrait{
  override def show() ={println("AAAAAAAAAAAAA")
   super.say();
  
  }
  
   def say1()=println("A 的say 方法")
}

trait B extends Decorationtrait{
  override def show() ={println("BBBBBBBBB")
    super.say();}
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
//   全部是show的话执行这个 的执行结果
//CCCCCCCCCCCC
//BBBBBBBBB
//AAAAAAAAAAAAA
//最基本的展示-----
  
/**
 * 如果A 和   B 将不调用show（）
 * 也就是不同名的方法、则只会执行最靠近的trait、先检查里面有没有该方法。。有就执行，没有就不执行
 * 也就是用super 调用的都是override的方法
 *   
 */
  
  }
  
}