package tests;
import org.testng.annotations.Test;
import genericlibs.ExcelLibrary;
import pages.LoginPage;

public class TestCase2 extends BaseTest
{
	@Test
	public void VeriErrorMsgcolor()
	{
		LoginPage l = new LoginPage(driver);
		String un=ExcelLibrary.getValue(XL_PATH, "TestCase2", 1, 0);
		String pwd=ExcelLibrary.getValue(XL_PATH, "TestCase2", 1, 1);
		l.setUsername(un);
		l.setPassword(pwd);
		l.clickLogin();
		
		l.VerifyErrormsgColor();
		
	}
}
