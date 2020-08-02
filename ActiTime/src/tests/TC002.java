package tests;

import org.testng.annotations.Test;

import pages.ChartListPage;
import pages.CreateChartPage;
import pages.HomePage;
import pages.ReportsPage;

public class TC002 extends BaseTest
{
@Test
public void createChart()
{
	HomePage home=new HomePage(driver,webActionUtil);
	home.clickOnReport();
	ReportsPage report=new ReportsPage(driver,webActionUtil);
	report.clickOnCreateChart();
	CreateChartPage createChart=new CreateChartPage(driver,webActionUtil);
	createChart.clickOnAddToDashBoard();
	createChart.enterChartName();
	createChart.clickOnSaveButton();
	createChart.clickOnCloseButton();
	ChartListPage chartList=new ChartListPage(driver,webActionUtil);
	chartList.verifyCHartName();
}
}
