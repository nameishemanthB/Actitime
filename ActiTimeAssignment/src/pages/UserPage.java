package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import library.WebActionUtil;

public class UserPage extends BasePage
{
	@FindBy(xpath="//div[text()='New User']")
	private WebElement newUser;
	
	@FindBy(xpath="//div[text()='Bulk Invitations']")
	private WebElement bulkInvitation;
	
	@FindBy(xpath="//div[contains(text(),'Departments')]")
	private WebElement departentBtn;
	
	@FindBy(id="createUserPanel_firstNameField")
	private WebElement firstName;
	
	@FindBy(id="createUserPanel_lastNameField")
	private WebElement lastName;
	
	@FindBy(id="createUserPanel_emailField")
	private WebElement email;
	
	
	@FindBy(xpath="//div[text()='Save & Send Invitation']")
	private WebElement saveAndSendBtn ;
	
	
	public UserPage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}
	
	public void clickOnNewuser()
	{
		webActionUtil.clickOnElement(newUser);
	}
	
	public void clickOnBulkInvitation()
	{
		webActionUtil.clickOnElement(bulkInvitation);
	}
	
	public void clickOnDepartments()
	{
		webActionUtil.clickOnElement(bulkInvitation);
	}
	
	public void enterAccountInfo(String FIRSTNAME, String LASTNAME, String EMAIL)
	{
		webActionUtil.enterKeys(firstName, FIRSTNAME);
		webActionUtil.enterKeys( lastName, LASTNAME);
		webActionUtil.enterKeys(email, EMAIL);
	}
	
	  
	  public void clickOnSaveAndSendInvitation()
	  {
		  webActionUtil.clickOnElement(saveAndSendBtn);
	  }
	  
	  public Boolean userVerification(String userName)
	  {
		  WebElement user = driver.findElement(By.xpath("//span[contains(text(),'"+userName+"')]"));
		  if(user.getText().contains(userName))
		  {
			  return true;
		  }
		  return false;
	  }
	  
}