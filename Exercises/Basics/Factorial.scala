import scala.jdk.Accumulator
//In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n

def factorial(num : Int) : Int = {
    if (num <= 0) 1
    else num * factorial(num - 1)
}

// Due to the re-use of the stack memory in recursion, this factorial is limited, scala utilizes the power of tail-call optimization
// this can be done the same way using if-else instead of pattern matching
def factorialOptimized(num:Int,accumulator: BigInt=1):BigInt = num match{
  case d if d<0 => throw new IllegalArgumentException("Factorial of negative numbers not allowed")
  case n if n<=1 => accumulator
  case a => factorialOptimized(num-1,accumulator*num)
}

println(factorial(10)) // call function with a number to get the factorial of that number
println(factorialOptimized(10))
println(factorialOptimized(20000)) // optimized function can be used to call factorial of large numbers