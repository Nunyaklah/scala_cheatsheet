// A list of data types in scala

/*
Boolean - true or false
Byte    - 8 bit signed value
Short   - 16 bit signed value
Char    - 16 bit unsigned unicode character
Int     - 32 bit signed value
Long    - 64 bit signed value
Float   - 32 bit IEEE 754 single-precision float
Double  - 64 bit IEEE 754 double-precision float
String  - A srquence of characters

***Advanced data types***
Unit    - Corresponds to no value
Null    - Null or empty reference
Nothing - Subtype of every other type
Any     - Supertype of any type
AnyRef  - Supertype of any reference type

*/

// VARIABLES

//mutable variable, value can be changed later
//must be initialized
//semicolon can be left out
var a: Int = 40;

// automatically recognises the data type
var a = 40
var a = 12.3 //double
var a = 12.3f // float
var isTrue = true  //recognises it as boolean


//immutable variable, value cannot be changed later
val b: Int = 40;

//multiple assignments
val x = {val a: Int = 2; val b: Int = 3; a+b} // last expression a+b gets returned and assigned to x

// lazy initialization
lazy val y = 50; // value gets assigned when y is used, safe for memory allocation

