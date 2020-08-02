package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage {
	
	@FindBy(xpath="//span[.='New Report']")
	private WebElement NewReport;
	
	@FindBy(xpath="//span[.='Create Chart']")
	private WebElement CreateChart;
	
	@FindBy(xpath="//div[.='Add to Dashboard']")
	private WebElement Dashboard;
	
	public ReportsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickNewReport()
	{
		NewReport.click();
	}
	public void clickCreateChart()
	{
		CreateChart.click();
	}
	public void clickDashboard()
	{
		Dashboard.click();
	}
}
