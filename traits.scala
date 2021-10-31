// Traits encapsulates method and field definitions, which can then be reused by mixing them into classes. In scala, a calss can inherit from only 
// one superclass, but then your class can mix a number of traits

//Defining a trait

trait canEat {
    def eat() = {
      println("Hi, i am eating")
    }
}


//mixing traits with a class

class Dog extends canEat{

}

//or you can use the with keyword

class Dog extends Animal with canEat{

}

//so you can use methods in the trait as so

val scobby = new Dog

scobby.eat()

//the class Dog could override the eat method in the canEat trait like so

class Dog extends Animal with canEat{
    override def eat() = {
        println("Hi , i am eating , i like to eat a lot")
    }
}


// you can also mix in multiple traits. Take it canFly is also a trait

class Dog extends Animal with canEat with canFly{
    override def eat() = {
        println("Hi , i am eating , i like to eat a lot")
    }
}
