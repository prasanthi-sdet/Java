package javaActivity3B;

import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray= {12,209,1,10,55,0,4};
		
		System.out.println("Array before sorting: "+Arrays.toString(numArray));
		
		int n = numArray.length;  
		 
		for (int j = 1; j < n; j++) { 			
			int key = numArray[j];  
			int i=j-1;
			for(; ( (i > -1) && ( numArray [i] > key ));i--)   
				numArray [i+1] = numArray [i]; 
			numArray[i+1] = key;  
		}  
		
		System.out.println("Array after sorting: "+Arrays.toString(numArray));
	}

}
