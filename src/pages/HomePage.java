package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibs.WebActionUtil;
public class HomePage extends BasePage
{
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(className="switcherBackground")
	private WebElement readyRadio;
	
	@FindBy(id="taskSearchControl_field")
	private WebElement taskSeachField;
	
	@FindBy(id="ext-gen23")
	private WebElement calendar;
	
	@FindBy(id="ext-gen44")
	private WebElement calendarBox;
	@FindBy(id="container_users")
	private WebElement usersBtn;
	
	@FindBy(id="container_reports")
	private WebElement Reports;
	public HomePage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}
	
	
	
	
	public void clickLogout()
	{
		logout.click();
	}
	
	public void selectDay(String month, String day)
	{
		calendar.click();
		calendarBox.findElement(By.xpath("//button[.='"+month+"']/../../../../../../../..//span[.='"+day+"']")).click();	
	}
	
	public void clickRadio()
	{
		readyRadio.click();
	}
	
	public void searchTask(String text)
	{
		taskSeachField.sendKeys(text);
	}
	
	public void clickReports()
	{
		Reports.click();
	}
	public UserPage clickOnUsers()
	{
		webActionUtil.clickOnElement(usersBtn);
		return new UserPage(driver,  webActionUtil);
	}
}






