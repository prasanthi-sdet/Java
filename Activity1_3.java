package javaActivity3A;

public class Activity1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sec=1000000000;

		double EarthSec=31557600;
		double MercurySec=0.2408467;
		double VenusSec=0.61519726;
		double MarsSec=1.8808158;
		double JupiterSec=11.862615;
		double SaturnSec=29.447498;
		double UranusSec=84.016846;
		double NeptuneSec=164.79132;
		
		System.out.println("Age on Mercury Planet: " + sec / EarthSec / MercurySec);
        System.out.println("Age on Venus Planet: " + sec / EarthSec / VenusSec);
        System.out.println("Age on Earth Planet: " + sec / EarthSec);
        System.out.println("Age on Mars Planet: " + sec / EarthSec / MarsSec);
        System.out.println("Age on Jupiter Planet: " + sec / EarthSec / JupiterSec);
        System.out.println("Age on Saturn Planet: " + sec / EarthSec / SaturnSec);
        System.out.println("Age on Uranus Planet: " + sec / EarthSec / UranusSec);
        System.out.println("Age on Neptune Planet: " + sec / EarthSec / NeptuneSec);

	}

}
