// HIGHER ORDER FUNCTIONS

def math(x: Double, y: Double, f: (Double, DOuble) => ): Double = f(x ,y);


//using the function as addition
val result = math(10, 20, (x,y) => x+y);
println(result);


//using the function as multiplication
val result = math(10, 20, (x,y) => x+y);
println(result);