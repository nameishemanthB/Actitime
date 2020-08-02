package genericlibs;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetPhoto
{
	public static String currentTime()
	{
		LocalDateTime ldt = LocalDateTime.now();
		return ldt.toString().replace(':', '-');
	}
	public static void getPhoto(WebDriver driver,String name)
	{
		TakesScreenshot t=(TakesScreenshot)driver;
	    File pageFile=t.getScreenshotAs(OutputType.FILE);
	    File file=new File(IAutoConstants.IMAGE_PATH+ currentTime()+name+".png");
	    try
	    {
			FileUtils.copyFile(pageFile,file);
		}
	    catch (IOException e1) 
	    {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
		
}
