// Classes, blueprint for creating objects

//Creating a class

class Animal

// create an object from this class

val dog = new Animal;


// Using constructors in your class

class Animal(val name: String, val age: Int)

// creating an object of this class

val dog = new Animal("Scobby", 20)


//accessing class properties

println(dog.name) //prints Scobby
println(dog.age) //prints 20



//* * * * * *USING INHERITANCE - EXTENDING CLASES * * * * * *

//you use inheritance when a super class shares a property with a subclass




