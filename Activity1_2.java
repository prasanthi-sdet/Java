package javaActivity2;

public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray={10, 77, 10, 54, -11, 10};
		
		int numToSearch=10;
		int sumExpected=30, sumActual=0;
		
		for (int i : numArray) {
			if(i==numToSearch)
				sumActual+=numToSearch;			
		}
		
		if(sumExpected==sumActual) {
			System.out.println("The sum of 10's in the array is 30");
		}
		else {
			System.out.println("The sum of 10's in the array is not 30");
		}
		

	}

}
