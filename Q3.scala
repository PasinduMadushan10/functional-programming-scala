object Fibonacci {

  def fibonacci(n: Int): Unit = {
    @ scala.annotation.tailrec
    def printFibonacci(i: Int, prev2: Int, prev: Int): Unit = {
      if (i == n) return
      println(prev)
      printFibonacci(i + 1, prev, prev + prev2)
    }

    if (n > 0) {
      printFibonacci(2, 0, 1) // Start with n=2 as base cases are already handled
    }
  }

  // Example usage
  def main(args: Array[String]): Unit = {
    fibonacci(10)
  }
}

