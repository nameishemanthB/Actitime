package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLibs.WebActionUtil;

public class TimeTrackPage extends BasePage
{
	@FindBy(linkText="View Time-Track")
	private WebElement viewTimeTrack;

	@FindBy(xpath="//td[contains(@class,'generatePDF')]")
	private WebElement exportToPdf;
	
	@FindBy(xpath="//span[@class='buttonTitle']")
	private WebElement  downloadPdf;
	
	@FindBy(xpath="//div[@class='userNameWrapper']/span[@class='dashedLink']")
	private WebElement meLink;
	
	@FindBy(xpath="//span[text()='White, Jane']")
	private WebElement text;
	
	
	public TimeTrackPage(WebDriver driver, WebActionUtil webActionUtil)
	{
		super(driver, webActionUtil);
	}
	
	public void clickViewTimeTrack()
	{
		webActionUtil.clickOnElement(viewTimeTrack);	
	}
	
	public void clickOnExportPdf()
	{
		webActionUtil.clickOnElement(exportToPdf);
	}
	
	public void clickOnDownloadPdf()
	{
		webActionUtil.scrollToElement(downloadPdf);
		webActionUtil.clickOnElement(downloadPdf);
	}
	
	public void clickOnMe()
	{
		webActionUtil.clickOnElement(meLink);
	}
	
	public void clickOnWhiteJane()
	{
		webActionUtil.clickOnElement(text);
	}
}
