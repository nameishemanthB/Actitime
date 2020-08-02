package testcases;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.ExcelLibrary;
//import library.RandomStringProvider;
import pages.HomePage;
import pages.UserPage;

public class TC001 extends BaseTest 
{

		@Test
		public void test1() 
		{
		
			String FIRSTNAME = ExcelLibrary.getValue(XL_PATH, "Sheet1", 0,1);
			String LASTNAME = ExcelLibrary.getValue(XL_PATH, "Sheet1", 1,1);
			String EMAIL = ExcelLibrary.getValue(XL_PATH, "Sheet1",2,1);
			
			
			HomePage h=new HomePage(driver,webActionUtil);
			UserPage u = h.clickOnUsers();
			Reporter.log("Clicked on Users", true);
			u.clickOnNewuser();
			Reporter.log("Clicked on new user", true);
			
			u.enterAccountInfo(FIRSTNAME, LASTNAME, EMAIL);
			Reporter.log("firstname,lastname,emai" , true);
			u.clickOnSaveAndSendInvitation();
			Reporter.log("clicked on save & send Invitation", true);
			
			Assert.assertTrue(u.userVerification(FIRSTNAME));
			Reporter.log("New user is added Successfully ", true);
			
		}
	}
