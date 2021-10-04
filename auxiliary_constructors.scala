// auxiliary constructor act as alternate constructors for the class

//defining an auxiliary constructor

class Animal (var name: String, var age: Int){
    def this(){ //this auxilliary constructor does not take any parameters, uses the default
        this("Rover", 2); // Provide default values for primary constructor, you must always do this
    }

    def this(name: String){ // this auxilliary constructor takes one parameter , and then uses the default second parameter that is age
        this(name , 2); // So when you use this 
    }
}

//to demonstate how this is used, we create 3 different instances 

var Dog = new Animal("Stanley", 4) // this uses the primary constructor
var Cat = new Animal() // this uses the first auxiliary constructor so takes default values Rover and age 2
var Parrot = new Animal("ChipCho") // this uses the second auxilliary constructor so you provide a name but then the age is default