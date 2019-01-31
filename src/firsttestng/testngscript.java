package firsttestng;

import org.testng.Assert;
import org.testng.annotations.Test;
// Test is the class
public class testngscript {

	@Test(priority=1,description = "This test case willl verify ogin functionality")
	public void loginApplication1()
	{
		System.out.println("Hello this is my first testng test");
		Assert.assertEquals(12, 13);
	}
	@Test(priority=2,description="This test case will add certain test cases in basket")
	public void selectitems()
	{
		System.out.println("Item selected");
	}
	@Test(priority=3,description="this test case will add some items")
	public void checkOut()
	{
		System.out.println("checkout");
	}
}
