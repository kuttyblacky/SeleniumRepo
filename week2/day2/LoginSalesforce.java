package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LoginSalesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver cd=new ChromeDriver();
		
		cd.get("https://login.salesforce.com/?locale=in");
		System.out.println("Chrome launched");
		cd.manage().window().maximize();
		cd.findElement(By.id("username")).clear();
		cd.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		cd.findElement(By.id("password")).clear();
		cd.findElement(By.id("password")).sendKeys("Leaf@123");
		cd.findElement(By.id("Login")).click();
		cd.quit();

	}

}
