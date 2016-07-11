/**
 *  访问修饰符学习
 */


class ProtectedStudy {
  protected def show(){
    print("父类show方法")
  }
  
  def see (){
    show();
  }
}

class ProtectedStudys extends ProtectedStudy{
  def start(){
    show()
  }
  
  def tow (son:ProtectedStudys){
    son.show()
  }
  
  def end(f:ProtectedStudy){
    //这里会报错、不予许通过 父类实例调用protected 方法
   // f.show();
  }
}
class car{
  def stop(s:ProtectedStudy){
    //这个不报错
    s.see()
    
    //这个报错  protected 只提供给子类使用
    //s.show()
  }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
/**
 * 测试包范围的private
 */
package A{
  
  package B{
    class Person{
      private[A] var name=null
      private[B] var age =10
      private[this] var sex=null
      
    }
      class zhangsan{
        //这里的person,要加包名，不然会有警告，存在调用的不去定性
      def show(p:B.Person){
       print( p.age)
       print(p.name) 
        // 这里会报错 sex 范围只在当前类中可用
       // p.sex
      }
      }
  }

  class lisi{
    //直接 包名。类名
    def show(p:B.Person){
      p.name
      //私有的范围在B，当前类在A
    //  p.age
      //sex的范围更小
    //  p.sex
    }
  }
  
}


