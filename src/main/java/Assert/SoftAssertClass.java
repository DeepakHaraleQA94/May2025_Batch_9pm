package Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {
	@Test
	public void validateLoginPage() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.name("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
//		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(url, "https://magnus.jalatechnologies.com/Home/Index123");
//		Assert.assertEquals(url, "https://magnus.jalatechnologies.com/Home/Index");
		Reporter.log("TC Passed", true);
		System.out.println("continue....");
		
		
	}
}
