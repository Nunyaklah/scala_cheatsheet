//In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n

def factorial(num : Int) : Int = {
    if (num <= 0) 1
    else num * factorial(num - 1)
}

println(factorial(10)) // call funtion with a number to get the factorial of that number
