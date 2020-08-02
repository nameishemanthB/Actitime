//"1.Launch the browser
//2.Enter the URL  'demo.actitime.com/reports/reports.do'
//3.Enter the username
//4.Enter the password
//5.Click on 'View Time- Track' in Menu bar
//6.Click on 'Export to PDF '
//7.Click on 'Download PDF ' button"



package tests;


import org.testng.annotations.Test;


import pages.TimeTrackPage;

public class TC001 extends BaseTest
{
	@Test
	public void downloadPdf()
	{
		TimeTrackPage ttp = new TimeTrackPage(driver, webActionUtil);
		ttp.clickViewTimeTrack();
		ttp.clickOnExportPdf();
		ttp.clickOnDownloadPdf();
	}
}
