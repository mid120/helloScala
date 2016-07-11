

class SingletonStudy {

}
//私有构造方法 private
class Person private (val color: String) {
  println(color)
}

//半生对象放在同一个文件中。同名、可以访问独立对象的private方法、不需要使用new 关键字
object Person {
  private val persons = Map(
    "yellow" -> new Person("yellow"),
    "balck" -> new Person("black"))

  def show(color: String) =
    persons(color)

}

object Test1 {
  def main(args: Array[String]): Unit = {
    
    // 调用半生对象 的show 方法和调用java中的静态一样
    println(Person show "yellow")
    println(Person show "yellow")
    println(Person show "yellow")
  }

}
//执行结果
/*yellow
black
Person@189a2557
Person@189a2557
Person@189a2557
 */
