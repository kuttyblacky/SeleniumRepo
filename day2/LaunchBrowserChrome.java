package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver cd=new ChromeDriver();
		
		cd.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("Chrome launched");
		cd.close();
		
	}

}
