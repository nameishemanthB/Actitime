package tests;

import org.testng.annotations.Test;

import genericlibs.ExcelLibrary;
import pages.HomePage;
import pages.LoginPage;

public class TC0001 extends BaseTest{
	@Test
	public void ReportsPageTest()
	{
		LoginPage l = new LoginPage(driver);
		String un=ExcelLibrary.getValue(XL_PATH, "TC001", 1, 0);
		String pwd=ExcelLibrary.getValue(XL_PATH, "TC001", 1, 1);
		l.setUsername(un);
		l.setPassword(pwd);
		l.clickLogin();	
		HomePage h = new HomePage(driver);
		h.clickReports();
	}
}
