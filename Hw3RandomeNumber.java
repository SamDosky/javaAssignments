package Hw3RandomeNumber;

import java.util.Random;
import java.util.Scanner;

public class Hw3RandomeNumber {

	public static void main(String[] args) {
		
			
		Random number = new Random ();
		
		int number1 = number.nextInt(5);
		
				
		     Scanner k = new Scanner(System.in);
	
			System.out.print(" Guess the number  ");

		 int guessnumber ;
		do {
			
			   guessnumber = k.nextInt();

		 	   if (guessnumber > number1 )
				
				System.out.println(" the number is higher");
			   
			   else if (guessnumber < number1 )
			   
			   System.out.println(" the number is less ");
			   
			   else
				 
				System.out.println(" number is correct ");

		} while ( number1 != guessnumber );
		
		
	}

}
