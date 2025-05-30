package Assert;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void validateCheckBox() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://magnus.jalatechnologies.com/");
//		WebElement checkBox = driver.findElement(By.xpath("//label/span"));
//		checkBox.click();
//		Thread.sleep(3000);
//		boolean isselected = checkBox.isSelected();
//		System.out.println(isselected);
		
		
		WebElement uname = driver.findElement(By.id("UserName"));
		 boolean isenable = uname.isEnabled();
//		 System.out.println(isenable);
		 
//		 if(isenable==false) {
//			 System.out.println("TC Passed");
//		 }else {
//			 System.out.println("TC failed");
//		 }
		 
		 Assert.assertEquals(isenable, false);
		 Reporter.log("TC passed",true);
		 
		
		
		
	}
}
