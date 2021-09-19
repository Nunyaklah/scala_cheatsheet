// maps is a collection of key value pairs, keys must always be unique

// maps can be mutable and immutable


//declaring maps

val mapname : Map[Int, String] = Map (1 -> "John", 2 -> "Mike", 3 -> "Chris")

//printout map

println(mapname)

//access particular key in map

println(mapname(2)) // prints out Mike

println(mapname.keys) // print out all keys which is a set

println(mapname.values) // print out all values


//iterating over map

mapname.keys.foreach{ key => 
    println("key " + key)
    println("value " + mapname(key))
}


//check if particular key is present or not

println(mapname.contains(3)) // returns a boolean



//concatenate two maps

fisrtmap ++ secondmap 