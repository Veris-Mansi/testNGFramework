package firsttestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class myapp {

	@Test
	public void startapp()
	{
		System.out.println("starting testing");
		Assert.assertEquals(12, 13);
	}
	@Test(dependsOnMethods="startapp")
	public void loginapp()
	{
		System.out.println("starting login");
	}
	@Test(dependsOnMethods="loginapp")
	public void logoutapp()
	{
		System.out.println("starting logout");
	}
}
