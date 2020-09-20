package javapractice;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("sai");
		hs.add("Chetan");
		hs.add("Adithya");
		hs.add("Teja");
		hs.add("Kundana");
		hs.add("Usha");
		
		System.out.println("The size of the HashSet: "+hs.size());
		System.out.println("The Objects of the HashSet: "+hs.toString());
		
		hs.remove("Kundana");
		
		System.out.println("Does Siri exists in the HashSet? true/false: "+hs.contains("Siri"));
		

		System.out.println("The Objects of the HashSet: "+hs.toString());
		

	}

}
