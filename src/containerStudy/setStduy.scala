package containerStudy

class setStduy {
  
  
}

object testSet{
  def main(args: Array[String]): Unit = {
    // 1容器的定义
    val a= Set("a","b","c")
    var b=a;
    b +="d"
    println(a)
    println(b)
    // 2  set 使用
     val x= Set("a","b","c")
     val y=Set("c","f")
     println(x.mkString("-"))//输出结果 ：a-b-c 
     //合并两个set   用++ 或  |
     println((x | y).mkString(","))//去重得到结果： a,b,c,f
     //获取容器的个数
     println(x.size*2)
     //执行交集运算     用& 或者是intersect
     val z= x intersect y
     println(z.mkString(","))
    //差集
    println(x -- y) //输出结果： Set(a, b)
    
    //添加或删除元素，可以直接用+,-方法来操作，添加删除多个元素可以用元组来封装：
    println(x + ("g","h"))
    println(x - ("g","j")) //删除没有的元素不会报错
    
    
    
    /**
     * 其他集合去重方法
     */
    println(List(1,2,2,3).distinct)
    println(List(1,2,2,3).toSet.toList )
    
    /**
     * map方法 给每个元素取出来。进行处理 
     * toArray 将集合转换成数组，用索引来访问
     */
     val zz= x map ( "111" + "xx"+ _)
     val zzz=zz.toArray
    println(zzz(0))
     
     
     
    
  }
}