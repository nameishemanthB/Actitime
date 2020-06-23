package com.actitime.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.Library.ExcelDataProvider;
import com.actitime.Library.WebActionUtil;

public class UserPage extends BasePage
{
	@FindBy(xpath="//div[text()='New User']")
	private WebElement newUserBtn;
	
	@FindBy(xpath="//div[text()='Bulk Invitations']")
	private WebElement bulkInvitationBtn;
	
	@FindBy(xpath="//div[contains(text(),'Departments')]")
	private WebElement departentBtn;
	
	@FindBy(id="createUserPanel_firstNameField")
	private WebElement firstNameTF;
	
	@FindBy(id="createUserPanel_lastNameField")
	private WebElement lastNameTF;
	
	@FindBy(id="createUserPanel_emailField")
	private WebElement emailTF;
	
	@FindBy(xpath="//div[@id='createUserPanel_accessToOtherProductSelectorLabel']/../..//div[@class='downIcon']")
	private WebElement departmentDropDown;
	
	@FindBy(xpath="//div[@class=\"item\"]")
	private List<WebElement> departmentList;
	
	
	@FindBy(xpath="(//td[@class='x-btn-right'])[4]")
	private WebElement CalenderIcon;
	
	@FindBy(xpath="(//div[.='Overtime Tracking:'])[2]/..//tr[@class=\" x-btn-with-menu\"]")
	private WebElement overtimedropDown ;
	
	@FindBy(xpath="//a[@class=\"x-menu-item\"]")
	private List<WebElement> overtimedropDownList ;
	
	@FindBy(xpath="//div[text()='Save & Send Invitation']")
	private WebElement saveAndSendBtn ;
	
	@FindBy(xpath="//span[text()='Close']")
	private WebElement closeInvitationBtn ;
	

	public UserPage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}
	
	public void clickOnNewuser()
	{
		webActionUtil.clickOnElement(newUserBtn);
	}
	
	public void clickOnBulkInvitation()
	{
		webActionUtil.clickOnElement(bulkInvitationBtn);
	}
	
	public void clickOnDepartments()
	{
		webActionUtil.clickOnElement(bulkInvitationBtn);
	}
	
	public void enterAccountInfo(String userFN, String userLN, String userEMAIL)
	{
		webActionUtil.enterKeys(firstNameTF, userFN);
		webActionUtil.enterKeys( lastNameTF, userLN);
		webActionUtil.enterKeys(emailTF, userEMAIL);
	}
	
	public void clickOnDeptDropDown()
	{
		webActionUtil.clickOnElement(departmentDropDown);
	}
	
	public void selectDepartment(String enterDept)
	{
		for (WebElement list : departmentList)
		{
			if(list.getText().equalsIgnoreCase(enterDept))
			{
				list.click();
				break;
			}
		}
	}
	
	public void clickOnCalender()
	{
		webActionUtil.clickOnElement(CalenderIcon);
	}
	
	public void selectdate(String Date, String Day)
	{
		while(true)
		{
			try
			{
				WebElement date = driver.findElement(By.xpath("//button[text()='"+Date+"']"));
				WebElement day = driver.findElement(By.xpath("//span[text()='"+Day+"'] "));
				if(date.getText().equals(Date))
				{
				     webActionUtil.clickOnElement(day);
				     break;
				}
			}
			 catch(NoSuchElementException e)
			{
				WebElement leftBtn = driver.findElement(By.xpath("//td[@class='x-date-left']"));
				webActionUtil.clickOnElement(leftBtn);
			}
		}
		
	}
	
	public void clickOnOvertimeDropDown()
	{
		webActionUtil.scrollIntoVIEW(overtimedropDown);
		webActionUtil.clickOnElement(overtimedropDown);
	}
	
	
	  public void selectfromOvertimeDropDown(String enterOverTimeTrackType)
	  { 
		  for(WebElement overtimelist : overtimedropDownList) 
		  {
			  if(overtimelist.getText().contains(enterOverTimeTrackType))
			  {
				  webActionUtil.clickOnElement(overtimelist);
				  break;
			  }
		  }
	  }
	  
	  public void closeInvitation()
	  {
		  webActionUtil.clickOnElement(closeInvitationBtn);
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
