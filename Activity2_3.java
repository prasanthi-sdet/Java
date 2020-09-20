package javapractice;

public class Activity2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mountainBike=new MountainBike(3, 50, 30);
		System.out.println(mountainBike.bicycleDesc());
		mountainBike.seatHeight=40;
		mountainBike.speedUp(10);
		System.out.println(mountainBike.bicycleDesc());
		mountainBike.applyBrake(20);
		System.out.println(mountainBike.bicycleDesc());
		

	}

}
