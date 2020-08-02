package genericlibs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class WebActionUtil 
{
public WebDriver driver;
long ETO;
public WebDriverWait wait;

public WebActionUtil(WebDriver driver,long ETO) 
{
	wait=new WebDriverWait(driver, ETO);
	this.driver=driver;
	this.ETO=ETO;
}
public void clickOnElement(WebElement target)
{
	wait.until(ExpectedConditions.elementToBeClickable(target));
	target.click();
}

public void jsClick(WebElement target) {
	wait.until(ExpectedConditions.visibilityOf(target));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", target);
}
public void enterKeys(WebElement target,String keysToSend)
{
	wait.until(ExpectedConditions.visibilityOf(target));
	target.clear();
	target.sendKeys(keysToSend);
}
public void verifyElementPresent(WebElement target)
{
	try
	{
	wait.until(ExpectedConditions.visibilityOf(target));
	Reporter.log("Chart Created",true);
	}
	catch(Exception EX)
	{
	Reporter.log("No Chart Created",true);
	}
}
public void scrollDown(WebElement target)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",target);
}
public void actionClick(WebElement target)
{
	Actions actions=new Actions(driver);
	actions.moveToElement(target).click().perform();
	
}
}
