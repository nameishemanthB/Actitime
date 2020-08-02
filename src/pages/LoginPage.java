package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLibs.WebActionUtil;

public class LoginPage extends BasePage
{
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver, WebActionUtil webActionUtil)
	{
		super(driver, webActionUtil);
	}
	
	public void login(String un, String pwd)
	{
		webActionUtil.enterKeys(username, un);
		webActionUtil.enterKeys(password, pwd);
		webActionUtil.clickOnElement(loginButton);
	}
}
