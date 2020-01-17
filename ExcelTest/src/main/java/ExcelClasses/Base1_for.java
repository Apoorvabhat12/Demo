package ExcelClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base1_for {
	
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public static void main(String[] args) throws IOException {
		 
	//	readData();
	//	readDataNaveen();
	//	setCelldata_mukesh();
	//	addColumn();
	//	setCelldata_mukesh1();

	}
	
	public  int getRowCount(String sheetname)
	{
		int rownum = sheet.getLastRowNum() + 1;
		
		return rownum;
		
	}
	
	static void readData() throws IOException
	{

		fis = new FileInputStream("C:\\Users\\apoora\\eclipse-workspace\\ExcelTest\\src\\main\\java\\excelUtility\\names.xlsx");
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheetAt(0);
		
		//XSSFSheet sheet = workbook.getSheet("Sheet1");
		 
		 
		 int rowcount = sheet.getLastRowNum();
		 
		 
		 for(int i=0;i<=rowcount;i++)
		 {
			 //String col1 = sheet.getRow(i).getCell(0).getStringCellValue();
			 
			 String col1 = sheet.getRow(i).getCell(0).getStringCellValue();
			 
			System.out.println(col1);
		
		 }
	}
	
	static void readDataNaveen() throws IOException
	{
		
		fis = new FileInputStream("C:\\Users\\apoora\\eclipse-workspace\\ExcelTest\\src\\main\\java\\excelUtility\\names.xlsx");
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheetAt(0);
		 
		 XSSFRow row1;
		 
		 row1= sheet.getRow(1);
		 
		 System.out.println("----------------naveen type---------------");
		 
		 for(int i=0; i<row1.getLastCellNum();i++)
		 {
			 String val = row1.getCell(i).getStringCellValue();
			 
			 System.out.println(val);
		 }
		
		 
	}
	
	static void setCelldata_mukesh() throws IOException
	 {
		
		File src = new File("C:\\Users\\apoora\\eclipse-workspace\\ExcelTest\\src\\main\\java\\excelUtility\\names.xlsx");
		fis = new FileInputStream(src);
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheetAt(0);
		 
		 sheet.getRow(0).createCell(3).setCellValue("status");
		 
		 FileOutputStream fout = new FileOutputStream(src);
		 
		 workbook.write(fout);
		 
		 fout.close();
	 
	 }
	
	
	
	static void setCelldata_mukesh1() throws IOException
	 {
		
		File src = new File("C:\\Users\\apoora\\Desktop\\automation.xlsx");
		fis = new FileInputStream(src);
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheetAt(0);
		 
		 for(int i=1;i<=sheet.getLastRowNum();i++)		 {
		 
		 sheet.getRow(i).createCell(3).setCellValue("pass");
		 
		 }
		 
		 FileOutputStream fout = new FileOutputStream(src);
		 
		 workbook.write(fout);
		 
		 fout.close();
	 
	 }
	
	static void setCellData_naveen() throws IOException
	{
		File src = new File("C:\\Users\\apoora\\eclipse-workspace\\ExcelTest\\src\\main\\java\\excelUtility\\names.xlsx");
		fis = new FileInputStream(src);
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheetAt(0);
		 
		// row = sheet.getRow(0).getCell(colNum);
		 
		 
	}
	 
	static void addColumn() throws IOException
	{
		File src = new File("C:\\Users\\apoora\\eclipse-workspace\\ExcelTest\\src\\main\\java\\excelUtility\\names.xlsx");
		fis = new FileInputStream(src);
		
		 workbook = new XSSFWorkbook(fis);
		
		 sheet = workbook.getSheetAt(0);
		 
		 XSSFCell cell = sheet.getRow(0).createCell(sheet.getRow(0).getLastCellNum());
			cell.setCellValue("status");
			
			FileOutputStream fileOut = new FileOutputStream(src);
			workbook.write(fileOut);
			fileOut.close();
	}
}
