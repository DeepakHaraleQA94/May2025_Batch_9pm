package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoA {
  @Test(groups = "sanity")
  public void A() {
	  System.out.println("this is testA method");
  }
  
  
  @Test(groups = "funcational")
  public void V() {
	  System.out.println("this is testV method");
  }
  
  
  @Test(groups = "sanity")
  public void P() {
	  System.out.println("this is testP method");
	  Assert.fail();
  }
  
  
  @Test(groups = "regression " )
  public void Q() {
	  System.out.println("this is test]Q method");
  }
}
