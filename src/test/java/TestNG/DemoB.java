package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoB {
	@Test(groups = "funcational")
	  public void U() {
		  System.out.println("this is testU method");
	  }
	
	@Test(groups = "regression")
	  public void Y() {
		  System.out.println("this is testY method");
	  }
	
	
	@Test(groups = "sanity")
	  public void F() {
		  System.out.println("this is testF method");
		  Assert.fail();
	  }
	
	
	@Test(groups = "regression")
	  public void G() {
		  System.out.println("this is testG method");
	  }
}
