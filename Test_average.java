package test_average;

import java.util.Scanner;

public class Test_average {

	public static void main(String[] args) {

		Scanner k  =  new Scanner (System.in) ;
		
		System.out.print(" insert the first score ");
		
		double first_score = k.nextInt();
		
		System.out.print(" insert the second score ");
		
		double second_score = k.nextInt();
		
		System.out.print(" insert the third score ");
	
		double third_score = k.nextInt(); 
		
		System.out.println("first score"+" "+ first_score + "\n"+ "second score" +" "+ second_score +"\n"+"third score"+" "+ third_score);

		double average_score = (first_score + second_score + third_score)/3 ;
		
		System.out.print("the average is" + " " + average_score);
		
	}

}
