//Lists are similar to arrays, but lists are immmutable

// declaring a list

val listName: List[Int] = List(9,4,5,3,53,6,2)

//printing elements in lists

println(listName)

//lists are index based

//some methods associated with lists

//get the first value in list

listName.head

//get remaining members of list after you take out the first value

listName.tail

// check that is is empty, returns boolean

listName.isEmpty

// reverse list order

listName.reverse


//create a list of 1s with 3 elements - creates a uniform list
List.fill(3)(1)


//iterating a list, performs what ever operation is in the for each parenthesis

listName.foreach(println)

//also you can iterate with for

for (x <- listName){
    println(x)
}
