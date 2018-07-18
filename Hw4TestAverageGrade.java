package Hw4TestAverageGrade;
import java.util.*;
public class Hw4TestAverageGrade {

	public static void main(String[] args) {

	double score1 ,score2 , score3 , score4 , score5 ;
	
	Scanner k = new Scanner(System.in);
	
	System.out.print(" enter the first score ");
	score1 = k.nextDouble();
	
	System.out.print(" enter the second score ");
	score2 = k.nextDouble();
		
	System.out.print(" enter the third score ");
	score3 = k.nextDouble();	
		
	System.out.print(" enter the fourth score ");
	score4 = k.nextDouble();
	
	System.out.print(" enter the fifth score ");
	score5 = k.nextDouble();
	
	System.out.println( score1 + "   " +determineGrade (score1));
	System.out.println( score2 + "   " +determineGrade (score2));
	System.out.println( score3 + "   " +determineGrade (score3));
	System.out.println( score4 + "   " +determineGrade (score4));
	System.out.println( score5 + "   " +determineGrade (score5));

	double ave = CalcAverage(score1,score2,score3,score4,score5);
	System.out.print("the average score is " + ave );
	System.out.println(" and the avarge grade is " +determineGrade (ave));

	
	
}
	 

public static double CalcAverage (double s1 ,double s2 ,double s3 ,double s4 ,double s5){
	
	return ((s1 + s2 + s3 + s4 + s5)/5) ;
    }
public static char determineGrade (double s){
	
	char grade = 0 ;
	
	if ( s >= 90){
		grade = 'A' ;
		
	}
	else if (s < 90 && s >= 80 ){
		
		grade = 'B' ;
	 
	}
	
	else if (s < 80 && s >= 70 ){
		
		grade = 'C' ;
	   
 
    }
	else if (s < 70 && s >= 60 ){
		grade = 'D' ;
		
	}
	else if (s > 0 && s < 60 ){
		grade = 'F' ;
	}
    return grade ;
   }
}