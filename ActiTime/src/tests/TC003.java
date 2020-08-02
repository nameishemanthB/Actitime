package tests;

import org.testng.annotations.Test;

import pages.CreateChartPage;
import pages.HomePage;
import pages.ReportsPage;

public class TC003 extends BaseTest
{
	@Test
	public void toDownloadChart()
	{
	HomePage home=new HomePage(driver,webActionUtil);
	home.clickOnReport();
	ReportsPage report=new ReportsPage(driver,webActionUtil);
	report.clickOnCreateChart();
	CreateChartPage createChart=new CreateChartPage(driver,webActionUtil);
	createChart.clickOnAllStaff();
	createChart.clickOnSelectedStaff();
	createChart.clickOnUserWithoutdept();
	createChart.clickOnApply();
	createChart.clickOnExportBtn();
	createChart.clickOnDwnldBtn();
	createChart.clickOnDwnldCloseBtn();
	}
}

