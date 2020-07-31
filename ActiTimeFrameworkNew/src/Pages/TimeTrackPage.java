package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.WebActionUtil;

public class TimeTrackPage extends BasePage
{
	@FindBy(id="container_tt")
	private WebElement timeTrack;
	
//	@FindBy(id="addTaskButtonId")
	@FindBy(xpath="//span[contains(text(),'New')]")
	private WebElement newButton;
	
//	@FindBy(xpath="//div[@class='searchItemList']/../../../..//div[.='- New Customer -']")
	@FindBy(xpath="//div[contains(text(),'New Customer')]")
	private WebElement selectCustomerAndProjectToAddTasksDropDown;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement enterCustomerName;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	private WebElement enterProjectName;
	
	@FindBy(xpath="//input[@placeholder='Enter task name']")
	private WebElement enterTaskName;
	
	@FindBy(xpath="//input[@placeholder='not needed']")
	private WebElement estimateHours;
	
	@FindBy(id="ext-gen72")
	private WebElement setDeadlineDate;
	
	@FindBy(className="x-date-right")
	private WebElement calenderBoxRightArrowButton;
	
	@FindBy(className="components_button withPlusIcon")
	private WebElement createTasks;
		
	@FindBy(xpath="//span[.='Akshata']/../../../../../..//div[@class='taskButton removeTaskButton']")
	private WebElement hideRowLink;
	
	@FindBy(xpath="//input[@id='SubmitTTButton']/..//span[contains(@class,'cancelButton')]")
	private WebElement cancelButton;
	
	@FindBy(id="SubmitTTButton")
	private WebElement saveChangesButton;
	
	@FindBy(id="taskRow141")
	private WebElement createdTask;
	
	@FindBy(xpath="//div[.='ACTIONS']")
	private WebElement actionDropDown;
	
	@FindBy(xpath="//div[.='Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//span[.='Delete permanently']")
	private WebElement deletePermanantlyButton;
	
	@FindBy(xpath="//div[.='Copy properties from existing tasks']")
	private WebElement copyPropertiesLink;
	
	@FindBy(xpath="//td[@class='dropdownButton']")
	private WebElement customerDropDown;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkboxOfTask;
	
	@FindBy(xpath="//a[.='View Time-Track']")
	private WebElement viewTimetrack;
	
	@FindBy(xpath="//td[contains(text(),'Export to PDF')]")
	private WebElement exportToPdf;
	
	@FindBy(xpath="//span[.='Download PDF']")
	private WebElement downloadPdf;
	
	
	
	public TimeTrackPage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}

	

	public void clickOnTimeTrack()
	{
		webActionUtil.clickOnElement(timeTrack);
	}
	
	public void clickOnNewButton()
	{
		webActionUtil.clickOnElement(newButton);
	}
	
	public void clickOnSelectCustomerAndProjectToAddTasksDropDown(String text)
	{
		webActionUtil.selectDropDownText(selectCustomerAndProjectToAddTasksDropDown, text);
	}
	
//	public void clickOnSelectCustomerAndProjectToAddTasksDropDown(int i)
//	{
//		webActionUtil.selectDropDownText(selectCustomerAndProjectToAddTasksDropDown, i);
//	}
	
//	public void clickOnSelectCustomerAndProjectToAddTasksDropDown(String text)
//	{
//		webActionUtil.enterKeys(selectCustomerAndProjectToAddTasksDropDown, text);
//	}

	public void clickOnEnterCustomerName(String customerName)
	{
		webActionUtil.enterKeys(enterCustomerName, customerName);
	}
	
	public void clickOnEnterProjectName(String projectName)
	{
		webActionUtil.enterKeys(enterProjectName, projectName);
	}
	
	public void clickOnEnterTaskName(String taskName)
	{
		webActionUtil.enterKeys(enterTaskName, taskName);
	}
	
	public void clickOnEstimateHours(String hours)
	{
		webActionUtil.enterKeys(estimateHours, hours);
	}
	
	public void clickOnSetDeadlineDate()
	{
		webActionUtil.clickOnElement(setDeadlineDate);
	}
	
	public void clickOnCalenderBoxRightArrowButton(String month, String day)
	{
		webActionUtil.clickOnElement(calenderBoxRightArrowButton);
		calenderBoxRightArrowButton.click();
		WebElement months = driver.findElement(By.xpath("//button[.='" + month + "']"));
		months.findElement(By.xpath("//span[.='" + day + "']"));
	}
	
	public void clickOnCreateTasks()
	{
		webActionUtil.clickOnElement(createTasks);
	}
	
	public void clickOnhideRowLink()
	{
		webActionUtil.clickOnElement(hideRowLink);
	}
	
	public void clickOncancelButton()
	{
		webActionUtil.clickOnElement(cancelButton);
	}
	
	public void clickOnConfirmationPopUp()
	{
		webActionUtil.confirmationPopUp();
	}
	
	public void clickOnsaveChangesButton()
	{
		webActionUtil.clickOnElement(saveChangesButton);
	}
	
	public void clickOnCreatedTask()
	{
		webActionUtil.clickOnElement(createdTask);
	}
	
	public void clickOnActionDropDown()
	{
		webActionUtil.clickOnElement(actionDropDown);
	}
	
	public void clickOnDeleteButton()
	{
		webActionUtil.clickOnElement(deleteButton);
	}
	
	public void clickOnDeletePermanantlyButton()
	{
		webActionUtil.clickOnElement(deletePermanantlyButton);
	}
	
	public void clickOncopyPropertiesLink()
	{
		webActionUtil.clickOnElement(copyPropertiesLink);
	}
	
	public void clickOnCustomerDropDown(String text)
	{
		webActionUtil.selectDropDownText(customerDropDown, text);
	}
	
	public void clickOnCheckboxOfTask()
	{
		webActionUtil.clickOnCheckbox(checkboxOfTask);
	}
	
	public void clickOnViewTimetrack()
	{
		webActionUtil.clickOnElement(viewTimetrack);
	}
	
	public void clickOnExportToPdf()
	{
		webActionUtil.clickOnElement(exportToPdf);
	}
	
	public void clickOnDownloadPdf()
	{
		webActionUtil.clickOnElement(downloadPdf);
	}
}
