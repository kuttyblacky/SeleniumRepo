package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= -7;
		
		if(num<0) {
			System.out.println("the given number is negative");
			int a=-(num);
			System.out.println("The Given Number is converted to positive  " +a);
		} else if(num>0) {
			System.out.println("The Given Number is Possitive " +num);
		}else {
			System.out.println("the Given Number is Zero");
		}
	}

}
