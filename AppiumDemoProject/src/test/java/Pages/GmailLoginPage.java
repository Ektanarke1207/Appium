package Pages;



import BaseClass.BaseClass;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;


public class GmailLoginPage extends BaseClass {
	
	

	
	public String GmailValidLoginPageTitle() throws InterruptedException {
		Thread.sleep(2000L);
		return driver.getTitle();
		
	}
	
	public static GmailHomePage GmailLogin() throws InterruptedException {
		System.out.println("I am inside Sample test");
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		MobileElement UserName = (MobileElement) (driver.findElement(By.name("identifier")));
		UserName.sendKeys("ektaautomation@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(5000L);
		
		driver.findElement(By.name("password")).sendKeys("Ekta@123");
		
//		MobileElement UserName = (MobileElement) (driver.findElement(By.name("password")));
//		UserName .sendKeys("Ekta@123");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		
		return new GmailHomePage();
	}
	
	
	

}
