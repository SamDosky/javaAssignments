package hw2TestScoresGrades;

import java.util.*;

public class Hw2TestScoresGrades {

	public static void main(String[] args) {
		
	Scanner test =  new Scanner (System.in)	;
	
	System.out.print("Please enter the first score ");
	
	int first_score = test.nextInt();
	
	System.out.print("please enter the second score ");
	
	int second_score = test.nextInt();
	
	System.out.print("please enter the third score ");
	
	int third_score = test.nextInt();
	
	int average = (first_score + second_score + third_score)/3 ;
	
	if (average >= 90)
	
	System .out.print(" the avarge Score is" +" "+ average +" " + "and the grade is A ");
	else if (average < 90 && average >= 80)
	
	System .out.print(" the avarge Score is" +" "+ average +" " + "and the grade is B ");

	else if (average < 80 && average >= 70)
	
    System .out.print(" the avarge Score is" +" "+ average +" " + "and the grade is C ");
	
	else if (average < 70 && average >= 60)
		
	System .out.print(" the avarge Score is" +" "+ average +" " + "and the grade is D ");
	
	else 
		
	System .out.print(" the avarge Score is" +" "+ average +" " + "and the grade is F ");




	
	
	
	 
		

	}

}
