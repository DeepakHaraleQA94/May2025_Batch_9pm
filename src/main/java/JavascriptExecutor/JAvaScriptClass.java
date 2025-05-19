package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JAvaScriptClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('UserName').value='training@jalaacademy.com'");
//		 driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");

		js.executeScript("document.getElementById('Password').value='jobprogram'");
		String javascript = "document.getElementById('btnLogin').style.border='4px solid red'";
		js.executeScript(javascript);
		Thread.sleep(6000);
		js.executeScript("document.getElementById('btnLogin').click()");
		Thread.sleep(3000);
		String getURL = js.executeScript("return document.URL").toString();
		System.out.println(getURL);

		String getTitle = js.executeScript("return document.title").toString();
		System.out.println(getTitle);

		

	}
}
