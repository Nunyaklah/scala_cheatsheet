// Using map and filter on collections

// what a map simply does is, it allows you to iterate over a collection and apply a function to each member in that collection

//so lets declare a list with some values

val myList = List(10, 20 , 30, 40, 60, 100)

// lets apply a map, say we want to add 10 to each member in our list so

println(myList.map(_ + 10)) // this does not modify the initial list, you assign to to a variable to have a new list 

// or 

println(myList.map(x => x + 10)) // same result as above

//filter method

println(myList.filter(x => x%2 == 0)) // gives us all values that can be divided by 2

//More on this toopic to come