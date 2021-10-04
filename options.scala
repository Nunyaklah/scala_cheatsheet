//Options gives you an instance of Some or None 
//to explain further

//lets declare a list
val myList = List(10,30,20)

//we want to find an item in the list so we do
println(myList.find(_ > 10)); // this returns Some(30, 20), meaning our list has some values greater than 10

println(myList.find(_ > 40)); // this returns None because there is no value in our list greater than 40, understand? Cool

//to get the value in the list we can use the .get or .getOrElse method 

println(myList.find(_ > 20).get) // this returns 30 cool

//it is not advisable to use get since this throws an exception if the value you want to get does not exist so to solve 
// this use getOrElse like so

println(myList.find(_ > 20).getOrElse(0)) // returns 0 is no value is found that is greater than 20


// defining an option

val optionName : Option[Int] = Some(4) //or

val optionName: Option[Int] = None;