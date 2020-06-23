package com.actitime.Library;

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
	public long ETO;
	public WebDriverWait wait;
	
	public WebActionUtil(WebDriver driver, long ETO)
	{
		this.driver=driver;
		wait= new WebDriverWait(driver, ETO);
		this.ETO=ETO;
    }

	public  void clickOnElement(WebElement target)
	{
		wait.until(ExpectedConditions.elementToBeClickable(target));
		target.click();
	}
	
	public void enterKeys(WebElement target , String keyToSend)
	{
		wait.until(ExpectedConditions.visibilityOf(target));
		target.sendKeys(keyToSend);
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
	
	public void scrollIntoVIEW(WebElement target)
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", target);
	}
	








}
