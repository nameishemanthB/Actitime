package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import genericlibs.ExcelLibrary;
import genericlibs.IAutoConstants;
import genericlibs.WebActionUtil;

public class ChartListPage extends BasePage
{

	public ChartListPage(WebDriver driver, WebActionUtil webactionutil) 
	{
		super(driver, webactionutil);
		
	}
	public String chartName =ExcelLibrary.getValue(IAutoConstants.EXCEL_PATH, "Sheet1", 1, 0);
	private WebElement chart=driver.findElement(By.xpath("//div[text()='"+chartName+"']"));
	public void verifyCHartName()
	{
		webActionUtil.verifyElementPresent(chart);
		System.out.println("Created ChartName :"+chartName);
	}
	
}
