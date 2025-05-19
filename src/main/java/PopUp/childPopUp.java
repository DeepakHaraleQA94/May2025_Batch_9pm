package PopUp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Mobile')]")).sendKeys("training@jalaacademy.com");

		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.xpath(" // button[contains(text(),'Sign')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Popups")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Popup One")).click();
		
		  String mainWindow = driver.getWindowHandle();
		  
		  System.out.println("main win ID: "+mainWindow);
		  
		   Set<String> windows = driver.getWindowHandles();
		   
		   Iterator<String> Itr = windows.iterator();
		   
		   String mainWin = Itr.next();
		     System.out.println("My main window id is "+mainWin);
		     String childId1 = Itr.next();
		     System.out.println("My child1 window id is "+childId1);
		     
		     driver.switchTo().window(childId1);
		     driver.manage().window().maximize();
		     
		     driver.switchTo().window(mainWin);
		     
		     driver.findElement(By.linkText("Home")).click();
		     
		     
		     
		     
		     
		     
		   
		   
		   
		   
		   
//		  for( String winId:windows) {
//			  System.out.println(winId.toString());
//		  }
		  
		
	}
}
