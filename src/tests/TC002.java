//1. Launch the browser 
//2. Enter the URL 'demo.actitime.com/reports/reports.do' 
//3.Enter the username
//4.Enter the password
//5. Click on 'Time- Track' icon in header of Home page 
//6. Click on 'Me' link in Enter Time for me page
//7.Select particular option from Me Drop down(White,jane)
//"


package tests;

import org.testng.annotations.Test;

import pages.TimeTrackPage;

public class TC002 extends BaseTest
{
	@Test
	public void setData()
	{
		TimeTrackPage ttp = new TimeTrackPage(driver,webActionUtil);
		ttp.clickOnMe();
		ttp.clickOnWhiteJane();
	}
}
