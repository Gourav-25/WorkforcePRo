package hrms.wokforcepro.genericfileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public String readDataFromExcel(String sheetName,int rowno,int cellno) throws Exception {
		FileInputStream fis=new FileInputStream("./TestData/hrmsdoc.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetName).getRow(rowno).getCell(cellno).getStringCellValue();
		return data;
	}
}
