package general;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		   int givenNumber = 6;
		   System.out.println("\nUsing muliplication");
           System.out.println("Factorial of "+givenNumber+ " is: "+factorialHavingLargeResult(givenNumber));
           
           System.out.println("\nUsing Recursion");
           System.out.println("Factorial of "+givenNumber+ " is: "+factorial(givenNumber));
	}

	//Using BigInteger
	private static BigInteger factorialHavingLargeResult(int n) {
	    BigInteger fact = BigInteger.ONE;
	    for (int i = 2; i <= n; i++)
	        fact = fact.multiply(BigInteger.valueOf(i));
	    return fact;
	}
	
	//Using Recursion
	private static int factorial(int n) 
    { 
        if (n == 0) 
            return 1; 
  
        return n * factorial(n - 1); 
    } 

}
