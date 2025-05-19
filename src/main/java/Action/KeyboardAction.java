package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://testautomationpractice.blogspot.com/#");
	
	driver.findElement(By.id("name")).sendKeys("Demo");
	driver.findElement(By.id("email")).sendKeys("Demo@gmail.com");
	driver.findElement(By.id("phone")).sendKeys("65733455");
	
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL);
	action.sendKeys("a");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("c");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	action.sendKeys(Keys.TAB);
	action.perform();
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("v");
	action.keyUp(Keys.CONTROL);
	action.perform();
	
	
	
}
}
