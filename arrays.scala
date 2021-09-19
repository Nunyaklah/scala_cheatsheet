// how to declare an array

val arrayname : Array[Int] = new Array[Int](5)

// the above means i am declaring an arrray called arrayname , its type being Array[Int] .
// Then we give it a size by new Array[Int](5), 5 is the size

// second sythax for declaring an array

val arrayname = new Array[Int](5)

//scala arrays index start from 0

//assigning members to array
arrayname(0) = 10
arrayname(1) = 30
arrayname(2) = 20
arrayname(3) = 58
arrayname(4) = 23

//Directly declaring and assigning items to an array

val arrayname = Array(3,4,5,6,7)


//printing members of array
// iterates through array and print items
for (y <- arrayname){
    println(y)
}

//NOTE: Arrays which have not been assinged any memebers take the default value of the data type it was declared with



//Concatenation 
concat(firstarrayname, secondarrayname) // remember the two arrays you are concantenating must be of the same type