package week2.day1;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		}
		
		for (int i = 0; i < arr.length; i++) {	
			int j = i+1;
			if (arr[i]!=j) {
				System.out.println("Missing element is :"+j);
				break;
			}
		}
	}
	

}
