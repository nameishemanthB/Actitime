package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericLibraries.WebActionUtil;

public class ReportPage extends BasePage{
	
	@FindBy(xpath="//span[text()='Create Chart']")
	private WebElement creatChart;
	
	@FindBy(xpath="//span[text()='New Report']")
	private WebElement newReport;
	
	@FindBy(xpath="//div[contains(@class,'createReportDropdownButton')]")
	private WebElement timeReport;
	
	@FindBy(xpath="//div[text()='Add to Dashboard']")
	private WebElement addToDashboard;
	
	@FindBy(id="VERTICAL_BAR")
	private WebElement verticalbarIcon;
	
	@FindBy(id="HORIZONTAL_BAR")
	private WebElement horizontalbarIcon;
	
	@FindBy(id="PIE_CHART")
	private WebElement pieChartIcon;
	
	@FindBy(xpath="//input[@class='reportNameEdit inputFieldWithPlaceholder']")
	private WebElement chartName;
	
	@FindBy(xpath="//span[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(id="createChartLightbox_cancelBtn")
	private WebElement closeBtn;
	
	@FindBy(xpath="//span[text()='Export to PDF']")
	private WebElement exportToPDF;
	
	public ReportPage(WebDriver driver, WebActionUtil webActionUtil) {
		super(driver, webActionUtil);
		
	}
    public void clickCreateChart()
     {
	    webActionUtil.clickOnElement(creatChart);
      }
    public void clicknewReport()
    {
	    webActionUtil.clickOnElement(newReport);
     }
    public void clicktimeReport()
    {
	    webActionUtil.clickOnElement(timeReport);
     }
    public void clickOnAddtoDashboard()
    {
    	webActionUtil.clickOnElement(addToDashboard);
    }
    public void createChartName(String chartname) {
    	webActionUtil.enterKeys(chartName, chartname);
    }
    public void clickOnSave()
    {
    	webActionUtil.clickOnElement(saveBtn);
    }
    public void clickOnCloseBtn()
    {
    	webActionUtil.clickOnElement(closeBtn);
    }
    public void clickOnexporToPDF()
    {
    	webActionUtil.clickOnElement(exportToPDF);
    }

}
