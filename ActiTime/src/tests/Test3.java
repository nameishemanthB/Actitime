package tests;
import org.testng.annotations.Test;
import genericlibs.ExcelLibrary;
import pages.HomePage;
import pages.LoginPage;
public class Test3 extends BaseTest
{
	@Test
	public void HomePageTest()
	{
		LoginPage l = new LoginPage(driver);
		String un=ExcelLibrary.getValue(XL_PATH, "TestCase1", 1, 0);
		String pwd=ExcelLibrary.getValue(XL_PATH, "TestCase1", 1, 1);
		l.setUsername(un);
		l.setPassword(pwd);
		l.clickLogin();	
		HomePage h = new HomePage(driver);
		h.clickRadio();
	}
}
