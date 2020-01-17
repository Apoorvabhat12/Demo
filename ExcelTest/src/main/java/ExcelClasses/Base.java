package ExcelClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Base {
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static Row row;
	static Cell cell;
	static XSSFSheet sheet;
	public static void main(String[] args) throws IOException {
		 
		readData();

	}
	
	
	static void readData() throws IOException
	{
		fis = new FileInputStream("C:\\Users\\apoora\\eclipse-workspace\\ExcelTest\\src\\main\\java\\excelUtility\\names.xlsx");
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheetAt(0);
		
		//XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		row = sheet.getRow(0);
		 cell = row.getCell(0);
		 
		//double val = sheet.getRow(1).getCell(1).getNumericCellValue();
		String val1 = sheet.getRow(1).getCell(0).getStringCellValue();
		
		//System.out.println(cell);
		 //System.out.println(sheet.getRow(1).getCell(0));
		 System.out.println(val1);
		 
		 
	}

}
