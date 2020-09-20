package javapractice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numsList=new ArrayList<Integer>();
		Random indexGen=new Random();		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Numbers and Once you are done type EOF to terminate10");
		while(scan.hasNextInt()){
			numsList.add(scan.nextInt());
		}
		
		Integer numsArray[] = numsList.toArray(new Integer[0]);
        int index = indexGen.nextInt(numsArray.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + numsArray[index]);
		
		scan.close();
		
		
		
		
		
		
		
		

	}

}
