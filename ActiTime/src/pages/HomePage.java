package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLibraries.WebActionUtil;

public class HomePage extends BasePage{
	
	@FindBy(linkText="Time-Track")
	private WebElement timeTrack;
	
	@FindBy(linkText="Tasks")
	private WebElement Tasks;
	
	@FindBy(linkText="Reports")
	private WebElement Reports;
	
	@FindBy(linkText="Users")
	private WebElement Users;
	
	@FindBy(linkText="Logout")
	private WebElement Logout;
	
	@FindBy(xpath="//span[text()='New']")
	private WebElement NewButton;
	
	public HomePage(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);	
	}
	public void clickTasks()
	{
		webActionUtil.clickOnElement(timeTrack);
	}
	public ReportPage clickOnReport()
	{
		webActionUtil.clickOnElement(Reports);
		return new ReportPage(driver,webActionUtil);
	}
	public void clickOnUsers()
	{
		webActionUtil.clickOnElement(Users);
	}
	public void clickOnLogout()
	{
		webActionUtil.clickOnElement(Logout);
	}
	
	

}
