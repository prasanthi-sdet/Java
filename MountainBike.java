package javapractice;

public class MountainBike extends Bicycle{
	
	public int seatHeight;
	
	public MountainBike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight=seatHeight;
	}
	
	public void setHeight(int seatHeight) {
		this.seatHeight=seatHeight;
	}

	public String bicycleDesc() {
		return("Gears: "+gears+" and CurrentSpeed is: "+currentSpeed+" wiht Seat Height: "+seatHeight);
	}

}
