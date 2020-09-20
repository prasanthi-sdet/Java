package javapractice;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("Sai");
		myList.add("Chetan");
		myList.add("Adithya");
		myList.add("Teja");
		myList.add("Kundana");
		myList.add(0, "Usha");
		
		System.out.println("All the names in the List:");		
		for (String string : myList) {
			System.out.println(string);
		}
		
		System.out.println("3rd name in the List: "+myList.get(2));
		
		System.out.println("Does Adithya exists in the List? true/false: "+myList.contains("Adithya"));
		
		System.out.println("The size of the List: "+myList.size());
		
		myList.remove(0);
		
		System.out.println("The size of the List: "+myList.size());
	}

}
