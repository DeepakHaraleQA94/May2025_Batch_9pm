package ListBox_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile')]")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.xpath(" // button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create")).click();
		  WebElement Contrydropdown = driver.findElement(By.id("CountryId"));
		  Select select = new Select(Contrydropdown);
		  select.selectByVisibleText("India");
		  Thread.sleep(2000);
		  select.selectByVisibleText("Sri Lanka");
		  Thread.sleep(2000);
		  select.selectByIndex(2);
		  Thread.sleep(2000);
		  select.selectByValue("5");
	}
}
