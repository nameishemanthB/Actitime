package Createcustomer;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import Actitime.Baseclass;
import LoginLogout.HomePage;
import LoginLogout.Tasklistpage;

public class custoertest extends Baseclass {
public void testcreatecustomer() throws EncryptedDocumentException, IOException {
	String CN = f1.getExcelvalue("getExcelvalue,1,0");
	HomePage h=new HomePage(driver);
	h.gettask().click();
	
	Tasklistpage t= new Tasklistpage(driver);
	t.getask().click();
	t.getaddnew().click();
	t.getcustomer().click();
	t.getcustomername().sendKeys("SBI");
	t.getselectCustomer().click();
	t.getsubmit().click();
}
}
