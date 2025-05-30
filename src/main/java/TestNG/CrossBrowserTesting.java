package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters("Browsername")
	@Test
	public void test(String Browsername) {
		
		if(Browsername.equals("Firefox")) {
			driver = new FirefoxDriver();
		}else if(Browsername.equals("Chrome")) {
			driver = new ChromeDriver();
		}else if(Browsername.equals("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("check the browserName...!");
		}
		
		driver.get("https://magnus.jalatechnologies.com/");
		
	}
}
