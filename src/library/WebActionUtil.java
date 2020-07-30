package library;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActionUtil
{
	public WebDriver driver;
	long ETO;
	public WebDriverWait wait;

	JavascriptExecutor js;

	public WebActionUtil(WebDriver driver, long ETO)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, ETO);
		this.ETO=ETO;
		this.js= (JavascriptExecutor) driver;
	}

	public void clickOnElement(WebElement target)
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.elementToBeClickable(target));
		target.click();
	}

	public void enterKeys(WebElement target, String keysToSend)
	{
		wait.until(ExpectedConditions.visibilityOf(target));
		target.clear();
		target.sendKeys(keysToSend);
	}

	public void selectDropDownText(WebElement target, String text)
	{
		Select select = new Select(target);
		select.selectByVisibleText(text);
	}

	public void mouseHover(WebElement target)
	{
		Actions action = new Actions(driver);
		action.moveToElement(target).perform();
	}

	/*
	 * Method should scroll to Top
	 * 
	 */
	public void scrollToTop() 
	{

		js.executeScript("window.scrollBy(0,-500)");//scroll up
	}

	/*
	 * Method should scroll to End of the Page
	 * 
	 */
	public void scrollToEnd() 
	{
		js.executeScript("window.scrollBy(0,500)");//scroll down
	}

	/*
	 * Method should scroll to Element
	 * 
	 */
	public WebElement scrollToElement()
	{
		WebElement ele=driver.findElement(By.xpath("//span[.=' Home']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		return ele;
	}

	

}
