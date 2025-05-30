package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {

	@AfterClass
	public void closeBrowser() {
		Reporter.log("Browser Closed",true);
	}
	
	@BeforeMethod
	public void clickOnLoginButton() {
		Reporter.log("Enter UserName and Password",true);
		Reporter.log("Click on login button",true);
	}
	
	@AfterMethod
	public void ClickOnLogOut() {
		Reporter.log("Clicked on logout",true);	
	}
	
	@BeforeClass
	public void launchBrowser() {
		Reporter.log("Luanch browser and enter url",true);
	}
	
	@Test
	public void validateLoginPage() {
		Reporter.log("Successfully landing to homePage",true);
	}
	
	@Test
	public void validateLoginPage1() {
		Reporter.log("Successfully landing to homePage1",true);
	}
	
	
	
}
