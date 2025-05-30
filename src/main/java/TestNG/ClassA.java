package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {

	@Test
	public void add() {
		System.out.println("addtion is");
//		Assert.fail();
	}
	
	
	@Test
	public void sub() {
		System.out.println("Substraction is");	
//		Assert.fail();
	}
	
	
	@Test
	public void mul() {
		System.out.println("multiplication is");
	}
	
}
