package GradeBook;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Welcome to the GradeBook!");
    	System.out.println("Enter grades (1-100). Enter -1 to stop.");
    	
    	
    	double grade = 0;
    	int count = 0;
    	double total = 0;
    	double max = 0;
    	double min = 100;
    	double average = 0;

    	
    	System.out.println("Enter Grade:");
    	grade = in.nextDouble();
		in.nextLine();
		
		while (grade >= 0) {
			if (grade > 100) {
				System.out.println("Not valid! Please enter a different number.");
				grade = in.nextDouble();
				in.nextLine();
			} else {
				total = total + grade;
				count = count + 1;
				if (grade>max) {
					max = grade;
				}
				if (grade>min) {
					min = grade;
				}
			}
		}
		
		
		if (grade < 0) {
			System.out.println("All done!");
			in.nextLine();
		}	
		
		System.out.println("Count: " + count);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		average = total/count;
		System.out.println("Average: " + average);
		
    	}
  }