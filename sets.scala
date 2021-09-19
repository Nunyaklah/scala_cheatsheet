// Sets is a collection of different elements of same data type, sets cannot contain duplicates

// We have two types of sets, mutable and immutable sets

//declaring a set

val setName: Set[Int] = Set(2,4,6,7,8)

//printing set

println(setName)


//sets are by default immutable

//declaring set as muttable

var mutableSetName = scala.collection.mutable.Set(2,4,6,7,8)


//sets are not ordered

//test if an item is contained in a set or not

println(setName(2)) // this line of code checks if the number 2 is present in the set or not and returns a boolean

setName.head // returns first item in set at that instant

setName.tail // returns the rest of items apart from the first item in set

setName.isEmpty // returns a boolean to show if the set is empty or not

//concatenating sets

firstset ++ secondset //0r

firstset.++(secondset)

//remember when you concatenate sets the duplicates are removed

//intersection of two sets , as in show common members in two sets

firstset.&(secondset) // outputs common members in ser

//or 

firstset.intersect(secondset)


//interate through set

setName.foreach(println)


