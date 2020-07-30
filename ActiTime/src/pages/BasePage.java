package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebActionUtil;

public class BasePage {
	public WebDriver driver;
	WebActionUtil webActionUtil;
	public BasePage(WebDriver driver,WebActionUtil webActionUtil)
	{
		this.driver=driver;
		this.webActionUtil=webActionUtil;
		PageFactory.initElements(driver, this);
		
	}

}
