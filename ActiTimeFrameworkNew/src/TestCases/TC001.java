package TestCases;

import org.testng.annotations.Test;
import Pages.TimeTrackPage;

public class TC001 extends BaseTest
{
	@Test
	public void enterTimeTrack()
	{
		TimeTrackPage timeTrackPage = new TimeTrackPage(driver, webActionUtil);
		
		timeTrackPage.clickOnSelectCustomerAndProjectToAddTasksDropDown("- New Customer -");
		timeTrackPage.clickOnEnterCustomerName("Akshata");
		timeTrackPage.clickOnEnterProjectName("Actitime");
		timeTrackPage.clickOnEnterTaskName("Automate 100 Test Cases");
		timeTrackPage.clickOnEstimateHours("5");
		timeTrackPage.clickOnCalenderBoxRightArrowButton("August 2020", "3");
	
	}
}