package BaseClass;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void SetUp() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
			caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
//emulator-5554=> Udid
			caps.setCapability("w3c", false);

			caps.setCapability("webdriver.chrome.driver", "Driver/chromedriver.exe");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, caps);

		} catch (Exception exp) {
			System.out.println("cause is :" + exp.getCause());
			System.out.println("cause is :" + exp.getMessage());
			exp.printStackTrace();
		}

	}

//	@Test
//	public void SampleTest() {
//		System.out.println("I am inside Sample test");
//		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//		MobileElement Email = (MobileElement) (driver.findElement(By.name("identifier")));
//		Email.sendKeys("ektaautomation@gmail.com");
//		
//	}

	
	
	@AfterTest
	public void TearDown() {
//		driver.close();

	}

}
