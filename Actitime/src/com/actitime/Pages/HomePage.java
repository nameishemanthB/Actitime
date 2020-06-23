package com.actitime.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.Library.WebActionUtil;

public class HomePage extends BasePage
{
	@FindBy(id="logoutLink")
	public WebElement logoutBtn;
	
	@FindBy(id="container_users")
	private WebElement usersBtn;
	
	@FindBy(id="container_reports")
	private WebElement reportsBtn;
	
	@FindBy(id="container_tt")
	private WebElement timeTrackBtn;
	


	public HomePage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}
	
	public void logout()
	{
		webActionUtil.clickOnElement(logoutBtn);
	}
	public UserPage clickOnUsers()
	{
		webActionUtil.clickOnElement(usersBtn);
		return new UserPage(driver,  webActionUtil);
	}
	
	public void clickOnReports()
	{
		webActionUtil.clickOnElement(reportsBtn);
	}
	
	public void clickOnTimeTrack()
	{
		webActionUtil.clickOnElement(timeTrackBtn);
	}


	

}
