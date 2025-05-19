package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/#");
		 WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		 Actions action = new Actions(driver);
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   Thread.sleep(3000);
		   js.executeScript("arguments[0].scrollIntoView(true);", doubleClick);
		   Thread.sleep(3000);
		 action.doubleClick(doubleClick).perform();
		 Thread.sleep(3000);
		 WebElement drag = driver.findElement(By.id("draggable"));
		 WebElement drop = driver.findElement(By.id("droppable"));
		 
		 action.clickAndHold(drag).perform();
		 Thread.sleep(3000);
		 action.release(drop).perform();
		 
	}
}
