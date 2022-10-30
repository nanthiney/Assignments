package week1Day3;

import java.lang.reflect.Array;

public class FindCharCount {

	public static void main(String[] args) {
		
		String str="cognizant";
		char ch='c';
		int count=0;
		char[] chars=str.toCharArray();
		int len=chars.length;
		for(int i=0;i<len;i++) {
			
			if(chars[i]==ch) {
				count++;
			}
			
		}
		
		System.out.println("Count of 'c' in String is : "+count);
		System.out.println("Length of the String is " + len);

	}

}
