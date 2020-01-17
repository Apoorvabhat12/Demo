package ExcelClasses;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MainClass {
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public MainClass(String path) throws IOException
	{
		fis = new FileInputStream("C:\\Users\\apoora\\eclipse-workspace\\ExcelTest\\src\\main\\java\\excelUtility\\names.xlsx");
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheetAt(0);
	}
	
	public  int getRowCount(String sheetname)
	{
		int rownum = sheet.getLastRowNum() + 1;
		
		return rownum;
		
	}
	
	public String getData(String sheetName,int rownum,int column) throws IOException
	{
		 
		String val = sheet.getRow(rownum).getCell(column).getStringCellValue();
			 
		 return val;
		 

}
}
