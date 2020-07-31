package TestCases;

import org.testng.annotations.Test;

import Pages.TimeTrackPage;

public class TC005 extends BaseTest
{
	@Test
	public void enterTimeTrack()
	{
		TimeTrackPage timeTrackPage = new TimeTrackPage(driver, webActionUtil);
		
		timeTrackPage.clickOnViewTimetrack();
		timeTrackPage.clickOnExportToPdf();
		timeTrackPage.clickOnDownloadPdf();
	}
}
