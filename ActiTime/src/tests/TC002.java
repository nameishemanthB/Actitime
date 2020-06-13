package tests;
import org.testng.annotations.Test;
import genericlibs.ExcelLibrary;
import pages.LoginPage;
public class TC002 extends BaseTest
{
	@Test
	public void invalidLogin() throws InterruptedException
	{
		LoginPage l = new LoginPage(driver);
		String un=ExcelLibrary.getValue(XL_PATH, "TC002", 1, 0);
		String pwd=ExcelLibrary.getValue(XL_PATH, "TC002", 1, 1);
		l.setUsername(un);
		l.setPassword(pwd);
		l.clickLogin();
		l.verifyErrorMessge();
	}
}
