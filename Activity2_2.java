package javapractice;

public class Activity2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane=new Plane(10);
		
		plane.onboard("Sai");
		plane.onboard("Chetan");
		plane.onboard("Adithya");
		plane.onboard("Teja");
		plane.onboard("Sravan");
		
		System.out.println("Plane TakOff Time: "+plane.takeOff());
		System.out.println("Passengers on the Plane after Take off: "+plane.getPassengers());
		Thread.sleep(2000);
		plane.land();
		System.out.println("Plane Landing Time:"+plane.getLastTimeLanded());
	}

}
