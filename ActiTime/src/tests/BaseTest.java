package tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import genericlibs.GetPhoto;
import genericlibs.IAutoConstants;
import genericlibs.WebActionUtil;
import pages.HomePage;
import pages.LoginPage;
public class BaseTest implements IAutoConstants
{
public WebDriver driver;
public WebActionUtil webActionUtil;


@Parameters({"browserName","appURL","ETO","ITO"})
@BeforeClass
public void launchApp(@Optional(BROWSER_NAME)String browserName,
		@Optional(APP_URL)String appURL,
		@Optional(ETO)String ETO,
		@Optional(ITO)String ITO)
{
	if(browserName.equalsIgnoreCase("chrome"))
			{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver=new ChromeDriver(options);
			}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		FirefoxOptions options=new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled",false);
		driver=new  FirefoxDriver(options);
				
							
		}
	else
	{
		throw new IllegalArgumentException(browserName+"IS NOT SUPPORTED");
	}
	driver.manage().window().maximize();
	long implicit=Long.parseLong(ITO);
	driver.manage().timeouts().implicitlyWait(implicit ,TimeUnit.SECONDS);
	driver.get(appURL);
	long explicit=Long.parseLong(ETO);
	webActionUtil=new WebActionUtil(driver, explicit);
	}
@Parameters({"un","pwd"})
@BeforeMethod
public void loginApp(@Optional(USERNAME)String un,
		             @Optional(PASSWORD)String pwd)
{
	LoginPage login=new LoginPage(driver,webActionUtil);
	login.login(un,pwd);
	
}
@AfterMethod
public void logoutAPP(ITestResult result)
{
	if(result.getStatus()==2)
	{
		GetPhoto.getPhoto(driver, result.getName());
	}
	else
	{
		HomePage home=new HomePage(driver,webActionUtil);
		home.ClickOnlogOut();
	}
}
@AfterClass(alwaysRun=true)
public void closeApp()
{
	driver.quit();
}
}

