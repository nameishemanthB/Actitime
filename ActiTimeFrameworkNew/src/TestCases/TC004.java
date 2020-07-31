package TestCases;

import org.testng.annotations.Test;

import Pages.TimeTrackPage;

public class TC004 extends BaseTest
{
	@Test
	public void enterTimeTrack()
	{
		TimeTrackPage timeTrackPage = new TimeTrackPage(driver, webActionUtil);
		
		timeTrackPage.clickOnTimeTrack();
		timeTrackPage.clickOnNewButton();
		timeTrackPage.clickOnSelectCustomerAndProjectToAddTasksDropDown("- New Customer -");
		timeTrackPage.clickOnEnterCustomerName("Akshata");
		timeTrackPage.clickOnEnterProjectName("Eagle");
		timeTrackPage.clickOncopyPropertiesLink();
		timeTrackPage.clickOnCustomerDropDown("Akshata");
		timeTrackPage.clickOnCheckboxOfTask();
	}	
}
