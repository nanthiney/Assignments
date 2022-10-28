package week1Day2;

public class Factorial {
	public static void main(String[] args) {
		
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		System.out.println("Factorial of 5 is " + fact);
	}

}






/*
 * Classroom Assignment 2: Find Factorial of a given number Goal: To understand
 * the for loop and logic writing a) Create a class by name: Factorial b) Create
 * a main method using shortcut c) Declare a class variable of type of int with
 * a value as input d) Write a logic to print the factorial of the given input
 * Hint: use for loop from 1 --> n and multiply with previous multiplied value
 * n=5; fact=1; for(1;n;++){ fact=fact*1; } syso(fact)
 */