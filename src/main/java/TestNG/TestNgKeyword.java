package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgKeyword {

	
	
	@Test(priority = 10)
	public void B() {
		System.out.println("Test B");
	}
	
	@Test(invocationCount = 3, priority = -23, enabled = true, timeOut = 2000)
	public void devision() throws InterruptedException {
		Thread.sleep(4000);
		Reporter.log("devision",true);
	}
	
	@Test(priority = -11, dependsOnMethods ="substraction" )
	public void C() {
		System.out.println("Test C");
	}
	
	@Test
	public void A() {
		System.out.println("Test A");
	}
	
	@Test(priority = 1)
	public void substraction() {
		System.out.println("substraction");
	}
	
}
