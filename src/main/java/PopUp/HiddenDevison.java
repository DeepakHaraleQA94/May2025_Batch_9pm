package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDevison {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile')]")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.xpath(" // button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Popups")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("In Window Popup")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("promptBtn")).click();
		
		 Alert alt = driver.switchTo().alert();
		 
		  System.out.println( alt.getText());
		  Thread.sleep(2000);
		  alt.sendKeys("hello");
		  Thread.sleep(2000);
		  alt.accept();
		
		
	}
}
