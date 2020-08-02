package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import genericlibs.WebActionUtil;

public class BasePage 
{
WebActionUtil webActionUtil;
public WebDriver driver;
public BasePage(WebDriver driver,WebActionUtil webactionutil)
{
	this.driver=driver;
	this. webActionUtil=webactionutil;
	PageFactory.initElements(driver,this);
	
}
}
