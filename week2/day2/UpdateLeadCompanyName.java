package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateLeadCompanyName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver cd=new ChromeDriver();
		
		cd.get("http://leaftaps.com/opentaps/control/main");
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
		cd.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf1");
		cd.findElement(By.id("createLeadForm_firstName")).clear();
		cd.findElement(By.id("createLeadForm_firstName")).sendKeys("Manikandan1");
		cd.findElement(By.id("createLeadForm_lastName")).clear();
		cd.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramesh1");
		cd.findElement(By.id("createLeadForm_primaryEmail")).clear();
		cd.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manikandanramesh@mail.com");
		cd.findElement(By.id("createLeadForm_primaryPhoneNumber")).clear();
		cd.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("+919710962554");
		cd.findElement(By.name("submitButton")).click();
		cd.findElement(By.linkText("Edit")).click();
		cd.findElement(By.id("updateLeadForm_companyName")).clear();
		cd.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf2");
		cd.findElement(By.xpath("//*[@value='Update']")).click();
		
	}

}
