package genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class ExcelLibrary {
	public static String getvalue(String path,String sheetname,int r,int c)
	{
		String value="";
		try {
			FileInputStream fin=new FileInputStream(path);
		Workbook wb	=WorkbookFactory.create(fin);
		value=wb.getSheet(sheetname).getRow(r).getCell(c).getStringCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Reporter.log("Not able to read data",true);
		}
		return value;
				
	}

}
