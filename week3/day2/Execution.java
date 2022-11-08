package week3.day2;

public class Execution extends MultipleLanguage {
	
	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}

	public static void main(String[] args) {
		
		Execution e=new Execution();
		e.Java();
		e.Selenium();
		e.python();
		e.ruby();
		

	}

	

}
