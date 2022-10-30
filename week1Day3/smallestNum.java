package week1Day3;

import java.util.Arrays;

public class smallestNum {

	public static void main(String[] args) {
		/*
		 * Classroom Assignment :1 Find the Second smallest number in the array
		 * {23,45,67,32,89,22 } Hint: Use sort to
		 */
		
		
		int[] num={23,45,67,32,89,22 } ;
		Arrays.sort(num);
	
		System.out.println(num[1]);
	}
	

}
