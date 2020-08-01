package tests;

import org.testng.annotations.Test;

import genericlibs.ExcelLibrary;
import pages.HomePage;
import pages.LoginPage;

public class TC007 extends BaseTest {
	@Test
	public void homePaageLinks() throws InterruptedException
	{
		LoginPage l = new LoginPage(driver);
		String un=ExcelLibrary.getValue(XL_PATH, "TC001", 1, 0);
		String pwd=ExcelLibrary.getValue(XL_PATH, "TC001", 1, 1);
		l.setUsername(un);
		l.setPassword(pwd);
		l.clickLogin();
		Thread.sleep(5000);
		HomePage p = new HomePage(driver);
		System.out.println(p.getLinksCount());
		p.getLinkName();
	}
}
