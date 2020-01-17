package DataProviderClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class ExcelValues {
	
	
	public static ArrayList<Object[]> readFromExcel() throws IOException
	{
		
		ArrayList<Object[]> ob = new ArrayList<Object[]>();
		
		File src = new File("C:\\Users\\apoora\\Desktop\\automation.xlsx");
		
		FileInputStream ip =new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			
			
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			
			Object[] a = {username , password};
			
			ob.add(a);
		}
		
		return ob;
	
	}
	
	public static void writeExcel(int rownum , String data) throws Exception
	{
		File src = new File("C:\\Users\\apoora\\Desktop\\automation.xlsx");
		
		FileInputStream ip =new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		
		
		sheet.getRow(rownum).createCell(2).setCellValue(data);
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\apoora\\Desktop\\automation.xlsx");
		
		wb.write(f);
		
		f.close();
		
		
		
}
	
	
	public static int rowcount() throws IOException
	{
		File src = new File("C:\\Users\\apoora\\Desktop\\automation.xlsx");
		
		FileInputStream ip =new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		return rowcount;
	}

	public static int colcount() throws IOException
	{
		File src = new File("C:\\Users\\apoora\\Desktop\\automation.xlsx");
		
		FileInputStream ip =new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int colcount = sheet.getRow(0).getLastCellNum();
		return colcount;
	}
	
	
	public static boolean containsExcel(String search) throws IOException
	{
		int count=0;
		int contains=0;
		File src = new File("C:\\Users\\apoora\\Desktop\\automation.xlsx");
		
		FileInputStream ip =new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int row = ExcelValues.rowcount();
	
		int col = ExcelValues.colcount();
	
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<col;j++)
		{
			if(sheet.getRow(i).getCell(j).getStringCellValue().equals(search))
			{
				 contains = 1;
				count++;
			}
		}
	}
		if(contains==1)
			return true;
		else
			return false;
	}
	
}
