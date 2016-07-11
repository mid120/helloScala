
/**
 * 如果是var则生成private字段、public方法
 * 如果是val则生成private final字段 ，只有get方法，因为final必须是初始化完成。并不能通过set方法来改变
 * 如果什么都没有 则生成private 字段 和set 和get 方法
 */
class ConstrutorStudy(var name:Int) {
  println("构造方法体函数执行----------")
}

object Test{
 val a= new ConstrutorStudy(0)
 //通过set方法进行改变值
 a.name=1

 def main(args: Array[String]): Unit = {
    println(a.name)
 }
 
}