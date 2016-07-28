package containerStudy

/**
 * 方法名约定  以:结尾的方法 都是后面调用前面
 * +  - !  ~会映射成unary_+()方法
 */

object ListExtends {
  def main(args: Array[String]): Unit = {
    val c = new Cow()
    val m = new Mon()
    // c^m
    // c^:m
    +c
  }
}

class Cow {
  //注意等号中间的空格
  def unary_+ = println("------+号映射的方法")
  def ^(m: Mon) = { println("cow的方法") }

}
class Mon {
  def ^:(c: Cow) = { println("Mon的方法") }
}