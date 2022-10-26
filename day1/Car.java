package day1;

public class Car {
	
	public void driveCar() {
		System.out.println("I can drive my car");
	}
	public void applyBrake() {
		System.out.println("I have to apply brake whenever needed");
	}
	public void soundHorn() {
		System.out.println("I have to sound horn wherever needed");
	}
	public void isPuncture() {
		System.out.println("Oh my car is puncture");
	}

	public static void main(String[] args) {
		Car c=new Car();
		c.driveCar();
		c.applyBrake();
		c.soundHorn();
		c.isPuncture();
	
	}

}
