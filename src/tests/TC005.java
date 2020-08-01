package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class TC005 extends BaseTest
{
	@Test
	public void linkCount()
	{
		LoginPage l = new LoginPage(driver);
		l.getLinkName();
		
	}
}
