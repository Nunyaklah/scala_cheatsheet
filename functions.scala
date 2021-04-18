// FUNCTIONS

// Types of functions synthax

//basic type
def add(x :Int, y :Int) : Int = {
 return x + y;
}

// last statement gets returned in this functions

def subtract(x :Int, y :Int) : Int = {
  x - y;
}

def divide(x :Int, y :Int) : Int =  x / y;

// you can do this if you are certain of the data type to be returned
def multiply(x :Int, y :Int)  = x * y;


// Default value functions
// default values are taken as parameters if no value is assigned
def add(x:Int = 45, y:Int = 15) : Int = {
    return x + y
} 

// functions which do not return anything, like void 
def printAdd(x: Int, y:Int): Unit = {
    println(x+y);
}

//using operator symbols as function names
def +(x:Int = 45, y:Int = 15) : Int = { // works like using a name for a function
    return x + y
}

//Anonymous functions
var add  = (x : Int, y: Int) => x + y;  // anonymous function syntax
println(add(2,4));