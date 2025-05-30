package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNg {

	@Test
	public void test() {
//		System.out.println("hello ");
		Reporter.log("hello",true);
	}
	
	@Test
	public void test1() {
//		System.out.println("hello1 ");
		Reporter.log("hello1",true);
	}
	
	
}
