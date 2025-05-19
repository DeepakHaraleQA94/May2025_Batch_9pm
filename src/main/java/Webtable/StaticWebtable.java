package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaticWebtable {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://magnus.jalatechnologies.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('UserName').value='training@jalaacademy.com'");
		js.executeScript("document.getElementById('Password').value='jobprogram'");
		js.executeScript("document.getElementById('btnLogin').click()");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Search")).click();
		Thread.sleep(3000);
		 List<WebElement> getTableRowData = driver.findElements(By.xpath("//table[@id='tblEmployee']//tbody/tr"));
		  System.out.println(getTableRowData.size()); 
		  for(int i=0; i<getTableRowData.size();i++) {
			  System.out.println(getTableRowData.get(i).getText());
			  
			  System.out.println();
		  }
	}
}
