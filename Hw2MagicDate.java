package hw2magicdate;

import java.util.*;

public class Hw2MagicDate {

	public static void main(String[] args) {

		Scanner k = new Scanner (System.in);
		System.out.print("Enter which month  ");
		int months = k.nextInt();
		System.out.print("Enter which day  ");
		int days = k.nextInt();
		System.out.print("Enter the year in two digit  ");
		int years = k.nextInt();
		
		if (days*months == years)
			System.out.print("The date is magic");
		else 
			System.out.print("The date is not magic");
		
		
		

	}

}
