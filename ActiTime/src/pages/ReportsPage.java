package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import genericlibs.WebActionUtil;

public class ReportsPage extends BasePage
{
	
	@FindBy(xpath="//span[text()='Create Chart']")
	private WebElement createChart;
	
	public ReportsPage(WebDriver driver, WebActionUtil webactionutil)
	{
		super(driver, webactionutil);
		
	}
	public void clickOnCreateChart()
	{
		webActionUtil.clickOnElement(createChart);
	}
	
	

}
