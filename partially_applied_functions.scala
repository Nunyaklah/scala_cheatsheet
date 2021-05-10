// Partially Applied Functions
  
var add = (x: Int , y: Int, z: Int) => x + y + z

val f = add(10, 20, _: Int)

//call  partial fuction with the argument value

println(f(30));


