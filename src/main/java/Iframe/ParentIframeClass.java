package Iframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentIframeClass {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile')]")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.xpath(" // button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alt.accept();
		
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("iFrames")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("iframe2");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Toggle navigation")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Home")).click();
		
		
		
	}
}
