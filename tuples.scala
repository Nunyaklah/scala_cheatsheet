// Tuples is a class that can contain diffrent type of element, differn=ent data types

//define a tuple

val tupleName = (4, true, "Tom", "Reed", 0);

//tuples are immutanle :)

//print out tuple

println(tupleName)

//declaring a tuple with number of items

val mytuple = new Tuple3(1,5,true) //Note that the number 3 in front of Tuple3 specifies the number of items in the tuple


//aceesing values in tuples

tupleName._2 //fetches second item in the tuple


//iterating through a tuple

tupleName.productIterator.foreach{
   x => println(x)  //prints out values in tuple
}