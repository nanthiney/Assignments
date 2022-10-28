package week1Day2;

public class isPrime {

	public static void main(String[] args) {
		 boolean m=true;
		 int n=1567;
		 int rem;
		 for(int i=2;i<n;i++) {
			 
			 rem= n%i;
			 if(rem==0)
				 m=false;
			 
		 }
		 
		 if(m==true)
			 {
				 System.out.println("prime number");
			 }
			 else
			 {
				 System.out.println("not Prime number");
			 }
		 }

	}


