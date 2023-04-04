package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChromeDriver cd=new ChromeDriver();
		
		cd.get("http://leaftaps.com/opentaps/control/login");
		System.out.println("Chrome launched");
		cd.manage().window().maximize();
		cd.findElement(By.id("username")).clear();
		cd.findElement(By.id("username")).sendKeys("DemoCsr");
		cd.findElement(By.id("password")).clear();
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Leads")).click();
		//cd.findElement(By.xpath("//*[@class='contentarea']/div/div[5]")).click();
		cd.findElement(By.linkText("Create Lead")).click();
		cd.findElement(By.id("createLeadForm_companyName")).clear();
		cd.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		cd.findElement(By.id("createLeadForm_firstName")).clear();
		cd.findElement(By.id("createLeadForm_firstName")).sendKeys("Manikandan");
		cd.findElement(By.id("createLeadForm_lastName")).clear();
		cd.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramesh");
		cd.findElement(By.id("createLeadForm_primaryEmail")).clear();
		cd.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manikandanramesh@mail.com");
		cd.findElement(By.id("createLeadForm_primaryPhoneNumber")).clear();
		cd.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("+919710962554");
		cd.findElement(By.name("submitButton")).click();
		cd.quit();
	}

}
