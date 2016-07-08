
object whileStudy {

  def main(args: Array[String]) {

    //for循环第一次用法
    println( 1 to 10 )
    for( i <- 1 to 10 ){
      print( i + " " )
    }

    //for循环第二种闭区间
    println()
    for ( i <- 1 until 6 ){
      print( i + " " )
    }


    println()
    for( i <- 1 until( 10 ) reverse ){
      print(i+" ")
    }

    println()
    for( i <- "abcdefghijk" ){
      print( i+" " )
    }

    //高级for循环
    println()
    for( i <- 1 to 10 if i%2!=0 ){//守卫，做一次if判断，为true时进入if
      print( i + " === " )
    }

    println()
    for( i <- 1 to (10,2)){//循环步长，可以理解为每次迭代间隔
      print( i + " === " )
    }

    println()
    for( i <- 1 to (10,3)){//同上
      print( i + " === " )
    }

    println()
    for( i<- 1 to 5 ; j <- 1 to 5){//多层for循环
      print( i + j*10+ " " )
    }

    println()
    var a = for ( i <- 1 until 11 ) yield i%2
    print( a )

  }

}