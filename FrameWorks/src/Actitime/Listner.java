package Actitime;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Listner extends Baseclass {
public void OnTestFailure() {
	TakesScreenshot t = (TakesScreenshot)driver;
	File src=t.getScreenshotAs(OutputType.FILE);
	File dest= t.getScreenshotAs("./screenshot/"t+".png");
	try {
		FileUtils.copyFile(src,dest);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
}
