package javaActivity1;

public class Car {
	String color,transmission;
	int make,tyres,doors;
	
	public Car() {		
		tyres=4;
		doors=4;
	}
	
	public void displayCharacteristics() {		
		System.out.println("Color of the Car: "+color);
		System.out.println("Transmission of the Car: "+transmission);
		System.out.println("Make of the Car: "+make);
		System.out.println("No of tyres of the Car: "+tyres);
		System.out.println("No of doors of the Car: "+doors);		
	}
	
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car has stopped.");
	}

}
