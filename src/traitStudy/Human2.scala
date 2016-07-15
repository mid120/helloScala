package traitStudy
/**没有继承其他类可以通过
 * 通过继承混入 trait          1 这是混入的第一种方式   2 如果该类继承了其他类，则通过with 方法来混入，而且还可以override  trait中的方法
 */
class Human2 (val name:String) extends Friend{
  
}