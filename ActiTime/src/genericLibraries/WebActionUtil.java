package genericLibraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActionUtil {
	public WebDriver driver;
	public WebDriverWait wait;
	long ETO;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public WebActionUtil(WebDriver driver, long ETO)
	{
		this.driver=driver;
		this.ETO=ETO;
	}
	public void clickOnElement( WebElement target)
	{
		WebDriverWait wait=new WebDriverWait(driver,ETO);
		wait.until(ExpectedConditions.elementToBeClickable(target));
		target.click();
	}
	public void enterKeys(WebElement target,String keysToSend)
	{
		wait.until(ExpectedConditions.visibilityOf(target));
		target.sendKeys(keysToSend);
	}
	public void selectDropDownText(WebElement target, String text)
	{
		Select select=new Select(target);
		select.deselectByVisibleText(text);
	}
	public void mousHower(WebElement target)
	{
		Actions action=new Actions(driver);
		action.moveToElement(target).perform();
	}
	public void scrollToEnd()
	{
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void scrollToTop()
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	public void scrollUpToElement(WebElement target)
	{
		js.executeScript("arguments[0].scrollIntoView();", target);
	}

}
