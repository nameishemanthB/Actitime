package LoginLogout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy (id="logoutLink")
	private WebElement logoutlink;

@FindBy (id="container_tasks")
private WebElement task;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public String getlogout() {
	return logout();
}
public String gettask() {
	return task();
}

}

