object Mostrar {
  def main(args: Array[String]) = {
    val list = Array[Int](1, 2, 3, 4, 5)
    Mostrar(list)
  }
  def Mostrar(x: Array[Int]): Unit = x.foreach(y => println(s"valor : $y"))
}