package week1.day1;

public class Mobile {

	
	
	public void sendSMS()
	{
		System.out.println("From oppo");
	}
	
	public void makeCall()
	{
		System.out.println("Calling my friend");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m=new Mobile();

		m.sendSMS();
		m.makeCall();
		
		Iphone iphone=new Iphone();
		
		iphone.makeCall();
		iphone.model();
	}

}
