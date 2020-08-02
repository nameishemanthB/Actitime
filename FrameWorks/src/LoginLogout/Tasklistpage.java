package LoginLogout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasklistpage {
@FindBy(className="content tasks")
private WebElement task;

@FindBy(xpath="//div[.='Add New']")
private WebElement addnew;
 
@FindBy(className="item createNewCustomer")
private WebElement customer;

@FindBy(className="//div[.='Customer name cannot be empty']")
private WebElement customername;

@FindBy(className="//textarea[@placeholder='Enter Customer Description']")
private WebElement customrdescription;

@FindBy(xpath="//div[.='- Select Customer -' and @class='itemRow selected']")
private WebElement selectCustomer;
@FindBy(xpath="//div[.='Create Customer']")
private WebElement submit;

public Tasklistpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getask() {
	return task;
}
public WebElement getaddnew() {
	return addnew;
}
public WebElement getcustomer() {
	return customer;
}
public WebElement getcustomername() {
	return customername;
}
public WebElement getselectCustomer() {
	return selectCustomer;
}

public WebElement getsubmit() {
	return submit;
}












	
}