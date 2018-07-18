package Hw4RectangleArea;
import java.util.*;
public class Hw4RectangleArea {

	 public static void main(String[] args)
	   {
	      double length,    // The rectangle's length
	             width,     // The rectangle's width
	             area;      // The rectangle's area
	   
	      // Get the rectangle's length from the user.

	      length = getLength();
	   
	      // Get the rectangle's width from the user.
	      width = getWidth();

	      // Get the rectangle's area.
	      area = getArea(length, width);

	      // Display the rectangle data.
	      DisplayData(length, width, area);

	    }
	        
	      public static double getLength(){
	       
	       Scanner k = new Scanner( System.in ) ;
	       System.out.print(" enter the length ");
	       double L = k.nextDouble();
	       return L ;
	      }


	      public static double getWidth(){
	       
	       Scanner k = new Scanner( System.in ) ;
	       System.out.print(" enter the Width ");
	       double W = k.nextDouble();
	       return W ;
	      }


		   public static double getArea(double L , double W){
	      
	       return L * W ;
	      }


	      public static void DisplayData( double L , double W , double A ){

	       System.out.print("the length of the rectangle is " + L +" the width of the rectangle is "+ W + " and the area is "+ A);
	}
}