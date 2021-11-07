/*
    At the end of this tutorials, you would learn how to:
        1. Declare arrays in scala
        2. Populate arrays
        3. Iterate through an array
        4. Concatenate arrays
 */


/* Assignment and Declaration */


// how to declare an array

//val arrayname_1 : Array[Int] = new Array[Int](5)

// the above means i am declaring an arrray called arrayname , its type being Array[Int] .
// Then we give it a size by new Array[Int](5), 5 is the size

// second syntax for declaring an array

val arrayName_2 = new Array[Int](5)

//scala arrays index start from 0

//assigning members to array
arrayName_2(0) = 10
arrayName_2(1) = 30
arrayName_2(2) = 20
arrayName_2(3) = 58
arrayName_2(4) = 23

//Directly declaring and assigning items to an array

val arrayname_3 = Array(3,4,5,6,7)



/* Iteration */
//printing members of array
// iterates through array and print items
for (y <- arrayname_3){
    println(y)
}

// This can also be done using
arrayname_3.map(println)

//NOTE: Arrays which have not been assinged any memebers take the default value of the data type it was declared with


/*   Concatenation


    concat(firstarrayname, secondarrayname) // remember the two arrays you are concantenating must be of the same type
 */

// You can also concatenate arrays using ++ and using the .concat method
val newConcatArray: Array[Int] = arrayname_3 ++ arrayName_2
val newConcatArray_2: Array[Int] = arrayname_3.concat(arrayName_2)