package tests;

import org.testng.annotations.Test;

import pages.LoginPage;


public class TC004 extends BaseTest{
	
	
	@Test
	public void LoginPageImageCount()
	{
		LoginPage l = new LoginPage(driver);
		int a = l.getImagesCount();
		System.out.println(a);
	}
}
