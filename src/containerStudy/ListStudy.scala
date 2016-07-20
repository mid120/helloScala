package containerStudy
/**
 * list 操作
 */

object ListStudy {
  def main(args: Array[String]): Unit = {
    //定义
    val list= List("a","b","c")
    // 添加元素
   val list1= "d" :: list
    println(list1)
    println(list1 head)
    println(list1(2))
    
    //:::  list 添加list 是调用后面的list 方法  前缀运算符  如果想把元素添加到末尾，可以用个list封装，调用其前缀运算符   访问first' 的速度最快
    val  list2 = list ::: list1
    println(list2)
    
    //list 过滤  filter 返回list   forall 是否适合所有条件  exist 是否存在满足条件的
    println(list filter (_ contains "a"))
    println(list forall (_ contains "a"))
    println(list exists (_ contains "a"))
    
    //和set 类似，，也有map方法 取出每个元素进行操作
   val l=    list map (_ length)
    println(l.mkString(","))
    //求和表达式
    val ll=List[Int](1,2,2,2)
   val sum= ll.foldLeft(0)((t,x) =>  t+x)
   val sum2= (0 /: ll)(_+_)
   println(sum2)
    
    
    
  }
}