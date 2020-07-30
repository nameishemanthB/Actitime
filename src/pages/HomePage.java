package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.WebActionUtil;

public class HomePage extends BasePage
{
   
@FindBy(id="logoutLink")
   private WebElement logoutlink;
   


public HomePage(WebDriver driver, WebActionUtil webActionUtil) 
{
	super(driver, webActionUtil);
	
}

public void clickOnLogout()
{
	webActionUtil.clickOnElement(logoutlink);
}

	

}
