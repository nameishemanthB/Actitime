package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

		@FindBy(id="logoutLink")
		private WebElement logout;
		
		@FindBy(className="switcherBackground")
		private WebElement readyRadio;
		
		@FindBy(id="taskSearchControl_field")
		private WebElement taskSeachField;
		
		@FindBy(id="ext-gen23")
		private WebElement calendar;
		
		@FindBy(xpath = "//a")
		private List<WebElement> links;
		
		@FindBy(xpath = "//img")
		private List<WebElement> images;
		
		@FindBy(id="ext-gen44")
		private WebElement calendarBox;
		
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void clickLogout()
		{
			logout.click();
		}
		
		
		
		public void selectDay(String month, String day)
		{
			calendar.click();
			calendarBox.findElement(By.xpath("//button[.='"+month+"']/../../../../../../../..//span[.='"+day+"']")).click();	
		}
		
		public void getLinkName()
		{	
			for(WebElement link : links)
			{
				if(link.getText() != "")
				{
				System.out.println(link.getText().trim());
				}
			}
			}
		
		
		public int getLinksCount()
		{
			return links.size();
		}
		
		public int getImagesCount()
		{
			return images.size();
		}
		
		public void clickRadio()
		{
			readyRadio.click();
		}
		
		public void searchTask(String text)
		{
			taskSeachField.sendKeys(text);
		}
	
}
