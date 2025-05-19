package ListBox_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectValuesOfDropDown {

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
		    List<WebElement> listOfCountry = Contrydropdown.findElements(By.tagName("option"));
		    System.out.println(listOfCountry.size());
		    
		    for(int i=1;i<listOfCountry.size();i++) {
		    	System.out.println( i+"." +listOfCountry.get(i).getText());
		    }
		    
		  
	}
}
