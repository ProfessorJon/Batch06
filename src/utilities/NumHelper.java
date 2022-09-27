package utilities;

public class NumHelper {
    // Prime numbers can only be divisible with itself and 1, and has no other divisors
    public static boolean isPrime(int num)
    {
        // if number is less than or equal to 1, it's not prime
        if(num <= 1) return false;
        // if number is greater than or equal to 2, lets loop up to half of that input number and see if it's divisible
        // at some point with a certain number

        // ex. 20 -> we are going to see if we can get an even divisor to the input of 20. Logic is to just go with the
        // halfway point because if we try to divide say 11 / 20, or any number greater than 11, we will always get a fraction
        for(int i = 2; i <= num / 2; i++)
        {
            // increment i as a potential divisor to num up to num / 2; return false if it is ever perfectly divisible
            if((num % i) == 0) return  false;
        }
        // else return true if not divisible with any other number
        return true;
    }
}
