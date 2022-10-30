package week1Day3;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		/*
		 * Classroom Assignment 2 B: Find the duplicate values in the given array int[]
		 * nums = {12, 25, 12, 56, 89, 25} Goal: To understand the Arrays, loop, if a)
		 * Create a class by name: FindDups (with main method) in same package b) Create
		 * a int[] array with duplicate data c) Write a logic to find the duplicate
		 * values d) Run and Confirm the duplicate values are printed in console Hint:
		 * Use sort to
		 */
		
		int[] nums = {12, 25, 12, 56, 89, 25};
		int length=nums.length;
		Arrays.sort(nums);
		
		for(int i=0;i<length;i++)
		{
			System.out.println(nums[i]);
			for(int j=i+1;j<length;j++)
			{
				if (nums[i]==nums[j])
					
					System.out.println(nums[j]);
											}
			}
		}
	}


