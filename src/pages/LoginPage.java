package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.WebActionUtil;
public class LoginPage extends BasePage
{	
	@FindBy(name="username")
	private WebElement emailTb;
	
	@FindBy(name="pwd")
	private WebElement passwordTb;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement CheckBox ;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement Forgetpasswordlink;
	
	
	public LoginPage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}
	
	public void login(String un, String pwd)
	{
		webActionUtil.enterKeys(emailTb, un);
		webActionUtil.enterKeys(passwordTb, pwd);
		//webActionUtil.clickOnElement(CheckBox);
		webActionUtil.clickOnElement(loginButton);
	}
}