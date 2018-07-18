package Hw4PrimeNumber;

import java.util.Scanner;

public class Hw4PrimeNumber {

	public static void main(String[] args) {

		Scanner k = new Scanner (System.in);
		System.out.print(" Enter the number to check ");
		int prime = k.nextInt();
		boolean d = isPrime(prime);
	 	if (d == false){
	         System.out.println(" this number is not a prime number");
	         }
	         else
	    	 System.out.print(" this number is a prime number");
	         }
		
	

	     public static boolean isPrime(int a){
		
	   	 for ( int i = 2 ; i < a ; i++){
         if ( a%i == 0 )
    	 return false ;
      	
	}
		return true ;
  }
}
