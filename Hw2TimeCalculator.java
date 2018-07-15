package hw2TimeCalculator;

import java.util.Scanner;

public class Hw2TimeCalculator {

	public static void main(String[] args) {
	    
		Scanner Sec = new Scanner (System.in);
		
		System.out.print (" Enter the number of minutes ");
		
		int Second = Sec.nextInt();
		
		if  ( Second >= 86400)
			System.out.println(" there are " + Second/86400 + " day " );

		else if ( Second >= 3600)
			System.out.println(" there are " + Second/3600 + " hour "   );
		
		
        else if ( Second >= 60 )
			System.out.println(" there are " + Second/60 + " minute "  );
		
		
		
        else if ( Second < 60 )
		
			System.out.print(" there are " + Second + " seconds ");
		
	}

}
