package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLibs.WebActionUtil;
public class HomePage extends BasePage
{
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public HomePage(WebDriver driver, WebActionUtil webActionUtil)
	{
		super(driver, webActionUtil);
		
	}
	
	public void clickOnLogout()
	{
		webActionUtil.clickOnElement(logout);
	}
}






