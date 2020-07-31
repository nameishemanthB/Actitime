package TestCases;

import org.testng.annotations.Test;

import Pages.TimeTrackPage;

public class TC002 extends BaseTest
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
		timeTrackPage.clickOnEnterTaskName("Automate 100 Test Cases");
		timeTrackPage.clickOnEstimateHours("5");
		timeTrackPage.clickOnSetDeadlineDate();
		timeTrackPage.clickOnCalenderBoxRightArrowButton("August 2020", "3");
		timeTrackPage.clickOnCreateTasks();
		timeTrackPage.clickOnhideRowLink();
		timeTrackPage.clickOncancelButton();
		timeTrackPage.clickOnConfirmationPopUp();
		timeTrackPage.clickOnsaveChangesButton();
	}
}
