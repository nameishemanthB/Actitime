package tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibs.ExcelDataProvider;
import genericlibs.RandomStringProvider;
import genericlibs.WebActionUtil;
import pages.HomePage;
import pages.UserPage;

public class TC0002 extends BaseTest{
	@Test
	public void test1() 
	{
		String userFN = RandomStringProvider.getRandomString();
		String userLN = RandomStringProvider.getRandomString();
		String userEMAIL = userFN+"@gmail.com";
		String enterDept = ExcelDataProvider.getStringValue(XL_PATH, "UserDetails", 1, 0);
		String enterOverTimeTrackType = ExcelDataProvider.getStringValue(XL_PATH, "UserDetails", 3, 0);
		WebActionUtil  webActionUtil = null;
		
		HomePage h=new HomePage(driver,webActionUtil);
		UserPage u = h.clickOnUsers();
		UserPage u1=new UserPage(driver,webActionUtil);
		Reporter.log("Clicked on Users module", true);
		u.clickOnNewuser();
		Reporter.log("Clicked on new user button", true);
		u.enterAccountInfo(userFN, userLN, userEMAIL);
		Reporter.log("Provided required details", true);
		u1.clickOnDeptDropDown();
		u.selectDepartment(enterDept);
		Reporter.log("Selected the department", true);
		u1.clickOnCalender();
		u1.selectdate("June 2020", "20");
		Reporter.log("Selected date", true);
		u1.clickOnOvertimeDropDown();
		u1.selectfromOvertimeDropDown(enterOverTimeTrackType);
		Reporter.log("Selected Overtime Tracking option", true);
		u.clickOnSaveAndSendInvitation();
		Reporter.log("clicked on save & send Invitation button", true);
		u.closeInvitation();
		Assert.assertTrue(u.userVerification(userFN));
		Reporter.log("New user is added Successfully and able to see the new user in the userlist page", true);
		
	}

}
