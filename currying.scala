// Currying 

/* Used to transform a function with 
multiple argument into a function
that takes a single argument */

  // A function without currying
  def funcWithoutCurr(a:Int,b:Int) = a + b
  println(funcWithoutCurr(1, 2))

  // A function with currying
  
  // Method 1
  val funcWithCurr_1 = (funcWithoutCurr _).curried
  println(funcWithCurr_1(1)(2))

  // Method 2
  def funcWithCurr_2(a:Int)(b:Int) = a+b
  println(funcWithCurr_2(2)(3))