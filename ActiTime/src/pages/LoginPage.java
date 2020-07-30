
package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLibraries.WebActionUtil;

public class LoginPage extends BasePage{
	String expectedtitle="actiTIME - Login";
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forGot;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement rememberchkBox;
	
	@FindBy(xpath="//img")
	private List<WebElement> images;
	
	@FindBy(xpath="//a")
	private List<WebElement>  links;
	
	@FindBy(className="errormsg")
	private WebElement errorMsg;
	public LoginPage(WebDriver driver,WebActionUtil webActionUtil)
	{
		super(driver,webActionUtil);
	}
	public void login(String un,String pwd)
	{
		webActionUtil.enterKeys(username, un);
		webActionUtil.enterKeys(password, pwd);
		webActionUtil.clickOnElement(loginButton);
	}
	public void forgetpassword()
	{
		webActionUtil.clickOnElement(forGot);
	}
	public void keepedmeLoged()
	{
		webActionUtil.clickOnElement(rememberchkBox);
	}

	public int getImagecount()
	{
		return  images.size();
	}
	public int getLinkcount()
	{
		return  links.size();
	}
	public boolean verifyUrl(String title)
	{
		return title.equals(expectedtitle);
	}
	public boolean verifyErrorMsg()
	{
		return errorMsg.isDisplayed();
	}
}
