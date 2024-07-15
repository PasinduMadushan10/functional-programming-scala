object InventoryManagement {

  def getProductList: List[String] = {
    var productList: List[String] = List()
    var productName: String = ""

    do {
      println("Enter product name (type 'done' to finish):")
      productName = scala.io.StdIn.readLine()
      if (productName != "done") {
        productList = productList :+ productName
      }
    } while (productName != "done")

    productList
  }

  def printProductList(productList: List[String]): Unit = {
    productList.zipWithIndex.foreach { case (name, index) =>
      println(s"${index + 1}. $name")
    }
  }

  def getTotalProducts(productList: List[String]): Int = {
    productList.size
  }

  def main(args: Array[String]): Unit = {
    val productNames = getProductList
    println("\n--- Product List ---")
    printProductList(productNames)
    println(s"\nTotal Products: ${getTotalProducts(productNames)}")
  }
}

