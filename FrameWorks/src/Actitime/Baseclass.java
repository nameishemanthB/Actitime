package Actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import LoginLogout.HomePage;
import LoginLogout.Loginpage;

public class Baseclass {
	static {
	System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public FileLib f1= new FileLib();
	public WebDriver driver;
@BeforeClass
public void openBrowser() {
	driver=new ChromeDriver();
}
@BeforeMethod
public void login() throws IOException{
String	a=f1.getpropertyvalue("url");
String b=f1.getpropertyvalue("un");
String c=f1.getpropertyvalue("pw");
	driver.get(a);
	Loginpage l= new Loginpage(driver);
	l.login(b,c);
	
}
@AfterClass
public void logout() {
	HomePage h=new HomePage(driver);
	h.getlogout().click();
}
@AfterMethod
public void closeBrowser(){
	driver.close();
}
}
