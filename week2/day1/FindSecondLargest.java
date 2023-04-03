package week2.day1;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7};
		
		for (int i = 0; i < data.length; i++)   
		{  
		for (int j = i + 1; j < data.length; j++)   
		{  
		int tmp = 0;  
		if (data[i] > data[j])   
		{  
		tmp = data[i];  
		data[i] = data[j];  
		data[j] = tmp;  
		}  
		}  
		
		
	}
		System.out.println(data[data.length-2]);
	}
}
