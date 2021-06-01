package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.GmailLoginPage;
import Pages.GmailHomePage;

public class GmailLoginPageTest extends BaseClass {

	GmailHomePage GmailHomePage;
	

	public GmailLoginPageTest() {
		// To call parent class constructor to initialise the properties i.e
		// "TestBase()" or super constructor super() is used//
		super();
	}

	
// **************@BeforeMethod************************************//
@BeforeMethod
	public void LoginSetUp() {
		SetUp();
		// LoginPage Constructor
		GmailLoginPage constr = new GmailLoginPage();
	}


//*******************POSITIVE TEST CASES********************//	
//******************Test cases Started************************//

	@Test(priority = 0)

	public void G_Login_email_Test() throws InterruptedException {
		Thread.sleep(2000L);
		GmailHomePage = GmailLoginPage.GmailLogin();

	}
	
	

	// **************@AfterMethod************************************//
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}

}
