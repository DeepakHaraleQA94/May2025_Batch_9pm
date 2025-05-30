package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassB {

	@Test
	public void div() {
		System.out.println("div is");
	
	}
	
	@Test
	public void Show() {
		System.out.println("Hello jala");
		Assert.fail();
	}
	
	@Test
	public void demo() {
		System.out.println("Hello Java");
	}
}
