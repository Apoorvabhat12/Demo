package NewExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Library {
	
	static FileInputStream fis;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	public String path;
	static File src;
	
	public Library(String path) throws Exception
	{
		this.path = path;
		
		fis = new FileInputStream(path);
		
		 workbook = new XSSFWorkbook(fis);
	}
	
	
	public int getRows(String sheetname)
	{
		sheet = workbook.getSheet(sheetname);
		int rownum = sheet.getLastRowNum()+1;
		return rownum;
	}
	
	
	public String getData(String sheetname , int rownum , int colnum )
	{
		
		sheet = workbook.getSheet(sheetname);
		XSSFRow row1;
	 
		
		 String val = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		 
		 return val;
	 
	}
	
	public void setData(String sheetname , int rownum , int colnum , String data) throws IOException
	{
		
		sheet = workbook.getSheet(sheetname);
		
		sheet.getRow(rownum).createCell(colnum).setCellValue(data);
		
		FileOutputStream fout = new FileOutputStream(path);
		
		workbook.write(fout);
		
		fout.close();
	
	}
	
	public boolean addColumn(String sheetname, String columnName) throws IOException
	{
		try
		{
			
		fis = new FileInputStream(path);
			
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetname);
		
		XSSFCell cell = sheet.getRow(0).createCell(sheet.getRow(0).getLastCellNum());
		cell.setCellValue(columnName);
		

		FileOutputStream fileOut = new FileOutputStream(path);
		workbook.write(fileOut);
		fileOut.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
}
