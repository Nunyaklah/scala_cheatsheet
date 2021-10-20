// A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller natural numbers. 

def isPrime(num : Int) : Boolean = {
    def isPrimeCheck(limit : Int) : Boolean =
        if (limit <= 1) true
        else num % limit != 0 && isPrimeCheck(limit - 1)
    isPrimeCheck(num / 2)
}

println(isPrime(37)) 