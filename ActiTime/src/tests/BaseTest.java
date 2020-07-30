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

import genericLibraries.GetPhoto;
import genericLibraries.IAutoConstants;
import genericLibraries.WebActionUtil;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest implements IAutoConstants{
	public WebDriver driver;
	public WebActionUtil webActionUtil;
	@Parameters({"browserName","Url","ITO","ETO"})
	@BeforeClass
	public void launchApp(@Optional(BROWSER_NAME)String browserName,
			@Optional(URL)String Url,@Optional(ITO)String ITO,@Optional(ETO)String ETO)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			FirefoxOptions  option=new FirefoxOptions();
			option.addPreference("dom.webnotifications.enabled", false);
			driver=new FirefoxDriver(option);
		}
		else
		{
			throw new IllegalArgumentException(browserName+"Not supported");
		}
		driver.manage().window().maximize();
		long implicit=Long.parseLong(ITO);
		driver.manage().timeouts().implicitlyWait(implicit, TimeUnit.SECONDS);
		driver.get(URL);
		long explicit=Long.parseLong(ETO);
		webActionUtil =new WebActionUtil(driver, explicit);
	}
	
	@BeforeMethod
	@Parameters({"un", "pwd"})
	public void logToApp(@Optional(USERNAME)String un, @Optional(PASSWORD)String pwd)
	{
		LoginPage lp=new LoginPage(driver,webActionUtil);
		lp.login(un, pwd);
	}
	@AfterMethod
	public void logOutApp(ITestResult result)
	{
		if(result.getStatus()==2)
		{
			GetPhoto.getPhoto(driver, result.getName());
		}
		HomePage home=new HomePage(driver,webActionUtil);
		home.clickOnLogout();
	}
	
	
	@AfterClass(alwaysRun=true)
	public void closeApp()
	{
		driver.quit();
	}


}
