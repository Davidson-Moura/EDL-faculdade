object Hello {
  def main(args: Array[String]) = {
    val m1 : Map[Int,String] = CriaMapTri(3, "cachorro");

    val result = m1.foreach(x => println("Chave=" + x._1 + ", Valor=" + x._2))
  }
  def CriaMapTri(x : Int,a : String) : Map[Int,String] = Map(x -> s"$a ".concat(x.toString),x-1 -> s"$a ".concat((x-1).toString),x-2 -> s"$a ".concat((x-2).toString))
}
