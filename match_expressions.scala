// MATCH EXPRESSIONS

// match example
// will print the value of age if age is 15
val age = 15;

age match {
    case 20 => println(age);
    case 10 => println(age);
    case 15 => println(age);
    case 12 => println(age);
    case 18 => println(age);
    case _ => println("Default case"); // underscore defines the default case
}

// using match as an expression, assigning result to a variable
val result = age match {
    case 20 => age;
    case 10 => age;
    case 15 => age;
    case 12 => age;
    case 18 => age;
    case _ => "Default case"; // underscore defines the default case
}

println("The age result is "+ result)


// using logic in match expressions
val num = 4;

num match {
    case 1 | 3 | 5 => println("Number is odd");
    case 2 | 4 | 6 => println("Number is even");
    case _ => println("Hmm , i'd have to think about that !")
}

