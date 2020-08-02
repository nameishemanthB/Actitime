package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import genericlibs.ExcelLibrary;
import genericlibs.WebActionUtil;
import genericlibs.IAutoConstants;
public class CreateChartPage extends BasePage 
{

	public String chartName =ExcelLibrary.getValue(IAutoConstants.EXCEL_PATH, "Sheet1", 1, 0);
	@FindBy(className="addToDashboard")
	private WebElement addToDashBoard;
	@FindBy(xpath="//input[@class='reportNameEdit inputFieldWithPlaceholder']")
	private WebElement enterChartName;
	@FindBy(className="buttonIcon")
	private WebElement saveButton;
	@FindBy(id="closeCreateChartLightboxButton")
	private WebElement closeButton;
    @FindBy(id="createChartLightbox_taskUserSelectorButtonWrapperId")
    private WebElement allStaff;
    @FindBy(xpath="//div[@class='x-layer x-menu at-selector-menu usersSelectorType']//label[text()='Selected Staff']")
    private WebElement selectedStaff;
    @FindBy(xpath="//span[text()='Users Without Department']")
    private WebElement userswithoutdept;
    @FindBy(xpath="//span[text()='Apply']")
    private WebElement applyBtn;
    @FindBy(xpath="//span[text()='Export to PDF']")
    private WebElement exportBtn;
    @FindBy(xpath="//span[text()='Download PDF']")
    private WebElement dwnldBtn;
    @FindBy(id="closeCreateChartLightboxButton")
    private WebElement dwnldCloseBtn;
	public CreateChartPage(WebDriver driver, WebActionUtil webactionutil)
	{
		super(driver, webactionutil);
		
	}
	public void clickOnAddToDashBoard()
	{
		
//		webActionUtil.clickOnElement(addToDashBoard);
		webActionUtil.jsClick(addToDashBoard);
	}
	public void enterChartName()
	{
		webActionUtil.enterKeys(enterChartName, chartName);
	}
	public void clickOnSaveButton() 
	{
	    
		webActionUtil.clickOnElement(saveButton);
	}
	
	public void clickOnCloseButton() 
	{
	    
		webActionUtil.clickOnElement(closeButton);
	}
	public void clickOnAllStaff()
	{
		webActionUtil.clickOnElement(allStaff);
	}
	public void clickOnSelectedStaff()
	{
		webActionUtil.jsClick(selectedStaff);
//		webActionUtil.clickOnElement(selectedStaff);
	}
    public void clickOnUserWithoutdept()
    {
    	webActionUtil.clickOnElement(userswithoutdept);
    }
    public void clickOnApply()
    {
    	webActionUtil.clickOnElement(applyBtn);
    }
    public void clickOnExportBtn()
    {
//    	webActionUtil.clickOnElement(exportBtn);
    	webActionUtil.actionClick(exportBtn);
    	webActionUtil.actionClick(exportBtn);
    }
    public void clickOnDwnldBtn()
    {
    	webActionUtil.clickOnElement(dwnldBtn);
    }
    public void clickOnDwnldCloseBtn()
    {
    	webActionUtil.actionClick(dwnldCloseBtn);
    }

}
