import java.util.Scanner;
/**************************************************************
 * Purpose: This program takes in two numbers from the user.
   One number being the base and the other being the exponent.
   It then solves for x^n recursively.
 * Author's Panther ID: 3276301
 * Certification: I hereby certify that this work is my own
   and none of it is the work of any other person.
**************************************************************/

public class Exponentiation {
	public static void main(String[] args) { 
		long base; 
	    int exp;
	    long value = 0;
	    Scanner scnr = new Scanner(System.in);
	    System.out.println("Please enter number for base: ");
	    base = scnr.nextLong();          //stores user's base number
	    System.out.println("Please enter number for exponent: ");
	    exp = scnr.nextInt();            //stores user's exponent number
	    
	    if (exp <= 0){
	    	value = 1;                   //if exponent is 0 then value is 1
	    }
	    else if (exp == 1){              //if exponent is 1 then value is base
	    	value = base;
	    }
	    else if (exp % 2 == 0){          //if even number
	    	value = exponentiation(base, (exp/2));
	    }
	    else{                            //if odd number
	    	value = base * exponentiation(base, (exp/2));
	    }
	    System.out.println("Value of " + base + "^" + exp + " is: " + value); 
	  } 
	
	/*
	 * This is a recursive method that calculates x^n.
	 * 
	 * @param x  ,the base number.
	 * @param n  ,the exponent number.
	 * @return ,returns value of x^n
	 */
	public static long exponentiation(long x, int n){ 
		if (n <= 1){                   //if exponent has been reduced to 1
			return x * x; 
	    }
	    else {
	    	return exponentiation(x, n-1) * exponentiation(x, n-1);  //recursive call
	    }
	  }
}
