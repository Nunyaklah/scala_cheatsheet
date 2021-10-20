//  In mathematics, the Fibonacci numbers, commonly denoted Fₙ, form a sequence, 
// called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. 
//NB f(1) = 1 , f(2) = 1, f(n) = f(n-1) + f(n-2)


def fibonacci (num: Int) : Int = {
    if (num <= 2) 1
    else fibonacci(num - 1) + fibonacci(num - 2)
}

println(fibonacci(7)) //prints out the 7th fibonacci number in the series

