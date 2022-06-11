
/**
 * in scala, this code compiles fine,
 * but we cannot run this,
 * exception: main method is not static.
 * and in scala we dont have static keyword.
 * to solve this, we need to create a object instead of class.
 * In Object, every thing is static.
 * java compiler checks the main method and it should be static.
 */
class HelloWorld {

  def main(args: Array[String]): Unit = {
   println("Hello World")
  }
}
