package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.WebActionUtil;
public class HomePage extends BasePage
{
	@FindBy(id="logoutLink")
	public WebElement logout;
	
	@FindBy(id="container_users")
	private WebElement users;
	
	@FindBy(id="container_reports")
	private WebElement reports;
	
	@FindBy(id="container_tt")
	private WebElement timeTrack;
	

	public HomePage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}
	
	public void logout()
	{
		webActionUtil.clickOnElement(logout);
	}
	public UserPage clickOnUsers()
	{
		webActionUtil.clickOnElement(users);
		return new UserPage(driver,  webActionUtil);
	}
	
	public void clickOnReports()
	{
		webActionUtil.clickOnElement(reports);
	}
	
	public void clickOnTimeTrack()
	{
		webActionUtil.clickOnElement(timeTrack);
	}

}

