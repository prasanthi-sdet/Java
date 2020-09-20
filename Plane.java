package javapractice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	private List<String> passengersList;
	private int maxPass;
	private Date lastLandTime;
	
	public Plane(int num) {
		maxPass=num;
		passengersList=new ArrayList<>(maxPass);
	}
	
	public void onboard(String passName) {
		passengersList.add(passName);
	}
	
	public Date takeOff() {
		return new Date();
	}
	
	public void land() {
		lastLandTime=new Date();
		passengersList.clear();
	}
	
	public Date getLastTimeLanded() {
		return lastLandTime;
	}
	
	public List<String> getPassengers() {
		return passengersList;
	}

}
