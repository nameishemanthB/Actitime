package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import library.WebActionUtil;
public class LoginPage extends BasePage
{
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(name="pwd")
	private WebElement passWord;

	@FindBy(id="loginButton")
	private WebElement loginButton;


	public LoginPage(WebDriver driver, WebActionUtil webActionUtil) 
	{
		super(driver, webActionUtil);
	}
	
	public HomePage login(String USERNAME, String PASSWORD)
	{
		webActionUtil.enterKeys(userName, USERNAME);
		webActionUtil.enterKeys(passWord, PASSWORD);
		webActionUtil.clickOnElement(loginButton);
		
		return new HomePage(driver,  webActionUtil);
	}
	

}


