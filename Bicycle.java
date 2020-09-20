package javapractice;

public class Bicycle implements BicycleParts,BicycleOperations{
	
	public int gears,currentSpeed;
	
	public Bicycle(int gears, int currentSpeed){
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}

	@Override
	public void applyBrake(int decrement) {
		// TODO Auto-generated method stub
		currentSpeed-=decrement;
		
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		currentSpeed+=increment;
		
	}
	
	public String bicycleDesc() {
		return("Gears: "+this.gears+" and CurrentSpeed is: "+currentSpeed);
	}
	
	

}
