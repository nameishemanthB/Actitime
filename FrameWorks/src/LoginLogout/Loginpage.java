package LoginLogout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
@FindBy(id="username")
private WebElement unTxtbox;

@FindBy(name="pwd")
private WebElement pwTxtbox;

@FindBy(xpath="//div[.=\"Login \"]")
private WebElement login;

public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void login(String un,String pw) {
	unTxtbox.sendKeys(un);
	pwTxtbox.sendKeys(pw);
	login.click();
}
}
