package Actitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
public String getpropertyvalue(String key) throws IOException {
	FileInputStream f= new FileInputStream("./data/Frame.property");
	Properties p= new Properties();
			p.load(f);
	 String value=p.getProperty(key);
	return value;
}
public String getExcelvalue(String key) throws EncryptedDocumentException, IOException {
	FileInputStream f= new FileInputStream("./data/Frame.xlsx");
	Workbook wb=WorkbookFactory.create(f);
	wb.getSheet("customersheet").getrow("rownum").getcell("cellnum").tostring();
}
}
