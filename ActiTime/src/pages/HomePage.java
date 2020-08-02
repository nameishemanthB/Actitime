package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericlibs.WebActionUtil;

public class HomePage extends BasePage
{
    
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	@FindBy(id="container_reports")
	private WebElement reportIcon;
	public HomePage(WebDriver driver, WebActionUtil webActionUtil)
	{
		super(driver, webActionUtil);
		
	}
	public void ClickOnlogOut()
	{
		webActionUtil.clickOnElement(logoutButton);
	}
	public void clickOnReport()
	{
//		webActionUtil.jsClick(reportIcon);
		webActionUtil.clickOnElement(reportIcon);
	}

}
