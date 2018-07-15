package Hw3FileLetterCounter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Hw3FileLetterCounter {

public static void main(String[] args) throws IOException {
	  
	int countnumber = 0;
	Scanner k = new Scanner (System.in);
	
	System.out.print("insert the name of the file  ");
	String filename = k.nextLine();
	
	File file = new File(filename);
	
	Scanner outputfile = new Scanner(file);
	
	System.out.print("enter the letter that you looking for  ");
	String letter = k.nextLine();
	char A = letter.charAt(0);

	while (outputfile.hasNextLine()){
		
	String line =  outputfile.nextLine();

	for (int i = 0 ; i < line.length() ; i++){
	
	if ( A == line.charAt(i))
	 
	countnumber++;
	}		
}
 System.out.println(countnumber);
outputfile.close();
}
}