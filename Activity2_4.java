package javapractice;

public class Activity2_4 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		try {
		Activity2_4.exceptionTest("Not Null String");
		Activity2_4.exceptionTest(null);
		}catch(CustomException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void exceptionTest(String value) throws CustomException {
		if(value==null) {
			throw new CustomException("String value is null");
		}
		else {
			System.out.println(value);
		}
	}

}
