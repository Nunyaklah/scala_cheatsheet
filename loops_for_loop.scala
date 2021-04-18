// FOR LOOP

// for loop basic
for (i <- 1 to 5) {
    println("i is "+ i);
}

// for loop using to method
for (i <- 1.to(5)) {
    println("i is "+ i);
}


//for loop using until method
for (i <- 1.until(5)) { // using this method runs the for loop to 4 because of the keyword until
    println("i is "+ i);
}

//loop in a loop example, nested loop
for (i <- 1 to 5; j <- 1 to 3){
    println("i is "+ i + "and j is "+ j)
}

//looping through a list
val myList = List(1,4,6,7,8,9,10);

for (i <- myList){ 
    println("i is "+ i);
}

//filtering a list using for and if
val myList = List(1,4,6,7,8,9,10);

for (i <- myList; if i < 6){ //filters and prints values less than 6
    println("i is "+ i);
}

// using the for loop as an expression, assing the result to a variable
val result = for (i <- myList; if i < 6) yield{ //filters and prints values less than 6 
    i + 1;   
}

println("The result of adding one is "+ result);
