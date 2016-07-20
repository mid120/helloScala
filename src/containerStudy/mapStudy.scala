package containerStudy
/**
 * map  的增删改查
 */

object mapStudy {
  def main(args: Array[String]): Unit = {
    //map的定义
    val map1= Map("ab" -> "1","ac" -> "2")
     //根据key 过滤查找 
   val map2= map1.filterKeys { x => x.contains("c") }
   println(map2) //结果：Map(ac -> 2)
    //根据key 和value 查找     将键值对赋给元组
   val map3= map1 filter {e => 
     val (key,value)=e 
     value.startsWith("2") }
   println(map3)
   //get 用法  返回some 或者 none   或者调用Apply()方法  取出对应的值
   println(map1.get("ab"))
   //添加元素  会返回个新的map不会影响原来的map
  val map4=map1.updated("cc", "3")
  val map5=map1 +("dd" -> "4")
  val map6=map5 - ("dd")
  
   println(map4.get("cc"))//some(3)
   println(map1.get("cc"))//none
   println(map6)//none
   //遍历
   map1.keys.foreach { x =>println(x); println(map1.get(x)) }
   
  val set=  map1.toSet()
 
  println(set)
   
  }
}