package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/#");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(4000);
//		js.executeScript("window.scrollBy(0,2500)");
//		 WebElement dropdown = driver.findElement(By.id("comboBox"));
//		js.executeScript("arguments[0].scrollIntoView(true);", dropdown);
		
	      js.executeScript("alert('This is an alert created via JavaScriptExecutor');");
	}
}
