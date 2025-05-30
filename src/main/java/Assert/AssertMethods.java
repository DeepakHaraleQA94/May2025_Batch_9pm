package Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertMethods {

	
	@Test(enabled = false)
	 public void TC1() 
	 
	 {
	 String ExpectedResult="abc";
	 String ActualResult="abc1";
	 
	 Assert.assertEquals(ActualResult, ExpectedResult,"Result is not matching");
	 Reporter.log("TC1 is matching", true);
	 }
	
	
	@Test(enabled = false)
	 public void TC2() 
	 
	 {
	 String ExpectedResult="abc";
	 String ActualResult="abc1";
	 Assert.assertNotEquals(ActualResult, ExpectedResult, "Result is matching");
	 Reporter.log("TC2 test result is not matching", true);
	 }
	
	
	@Test(enabled = false)
	 public void TC3() 
	 
	 {
		
	 boolean Result=false;
	 
//	 Assert.assertTrue(Result, "Result is false");
//	 Reporter.log("TC3 is running", true);
	 
	 Assert.assertFalse(Result,"result true");
	 Reporter.log("TC3 is runing ",true);
	 
	 
	 }



	
	@Test(enabled = false)
	 public void TC5() 
	 
	 {
	String str=null;
//	Assert.assertNull(str,"Value is not null");
//	Reporter.log("TC5 is running", true);
	
	Assert.assertNotNull(str,"assert is null");
	Reporter.log("TC5 is running", true);
	 }

	
	
	@Test
	 public void TC7() 
	 
	 {
	Reporter.log("Assert fail check", true);
	Assert.fail();
	Reporter.log("TC7 is running", true);
	 }

	
	
	
}
