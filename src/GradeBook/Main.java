package GradeBook;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Welcome to the GradeBook!");
    	System.out.println("Enter grades (1-100). Enter -1 to stop.");
    	
    	
    	int highest, lowest, numOfGrades, sumOfGrades, current;

    	
    	System.out.println("Enter Grade:");
    	int grade = in.nextInt();
		in.nextLine();
		
		while (grade > 0) {
			System.out.println("Enter Grade:");
	    	int grade = in.nextInt();
			in.nextLine();
		}
		
		
		
		double average = sumOfGrades / numOfGrades;
    	}
 
    
    
    }