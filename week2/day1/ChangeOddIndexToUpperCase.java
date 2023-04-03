package week2.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String test = "changeme";
		char[] testArray = test.toCharArray();
		for (int i = 0; i < testArray.length; i++) {
			if(i%2==0){
				testArray[i] = Character.toUpperCase(testArray[i]);
				System.out.println(testArray[i]);
			} else if(i%2==1){
				System.out.println(testArray[i]);
			}
		}
	}

}
