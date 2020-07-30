package testcases;

import org.testng.annotations.Test;

public class KTC001  extends BaseTest
{
	@Test
	public void scrollpage() throws InterruptedException
	{   
		Thread.sleep(10000);
		webActionUtil.scrollToEnd();
		Thread.sleep(10000);
		webActionUtil.scrollToTop();
		
	}
	
	

}
