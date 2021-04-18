 //STRING INTERPOLATION

//normal string interpolation
val name = "John";
val age = 22;
println("My name is "+ name + " and i am "+ age + " years old"); // uses the + operation

// s string interpolation 
//not type safe
println(s"My name is $name and i am $age years old"); // uses s 

// f string interpolation
// type safe
println(f"My name is $name%s and i am $age%d years old");


//raw string interpolation
println(raw"Hello \nworld") //prints it as it is

