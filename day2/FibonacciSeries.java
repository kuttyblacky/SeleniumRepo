package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range=7,firNum=0,secNum=1,sum;
		System.out.println(firNum);
		System.out.println(secNum);
		for(int i=1;i<range;++i) {
			sum=firNum+secNum;
			firNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
	}

}
