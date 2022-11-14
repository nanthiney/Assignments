package week3day4;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String str="TestLeaf";
		//Convert string to charArray
		char[] ch=str.toCharArray();
		//Declare the set
		Set<Character> s=new LinkedHashSet<Character>();
	
		//Iterate through the loop
		for (Character each : ch) {
			
			s.add(each);
			
		}
				System.out.println(s);
			}
			
	}
