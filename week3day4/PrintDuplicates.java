package week3day4;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] n= {2,4,6,7,2,9,4,1};
		
		//Declare the set
		Set<Integer> s=new TreeSet<Integer>();
	//Add the element in the set
		//Iterate through the loop
		for (int i=0;i<n.length;i++) {
			boolean a=s.add(n[i]);
			if(!a) {
				System.out.println(n[i]);
			}
			
	}

}
}