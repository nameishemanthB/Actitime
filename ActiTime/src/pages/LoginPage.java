package pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage
{
	String expectedTitle = "actiTIME - Login";
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement remember;
	
	@FindBy(xpath="//span[.='Username or Password is invalid. Please try again.']")
	private WebElement error;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgot;
	
	@FindBy(xpath="//a")
	private List<WebElement> links;
	
	@FindBy(xpath="//img")
	private List<WebElement> images;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
	
	public void rememberClick()
	{
		remember.click();
	}
	
	public void forgotClick()
	{
		forgot.click();
	}
	
	public int getLinksCount()
	{
		return links.size();
	}
	
	public int getImagesCount()
	{
		return images.size();
	}
	
	
    
    public void VerifyErrormsgColor()
    {
    	String expectedHexa="#Ce0100";
        String ColorValue=error.getCssValue("color");
        String actualHexa=Color.fromString(ColorValue).asHex();
    	if(expectedHexa.equals(actualHexa))
    	{
    		Reporter.log("Error massage is in red color");
    	}
    	else
    	{
    		Reporter.log("Error massage is in red color");
    	}
    }
	
}
