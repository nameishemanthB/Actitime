package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ReportPage;

public class TC001 extends BaseTest{
	@Test
	public void createchart()throws InterruptedException
	{
	HomePage home=new HomePage(driver,webActionUtil);
	ReportPage reportpage=home.clickOnReport();
	reportpage.clickCreateChart();
	reportpage.clickOnAddtoDashboard();
	reportpage.createChartName("profit and loss of the year");
	reportpage.clickOnSave();
	reportpage.clickOnCloseBtn();
	
	}

}
