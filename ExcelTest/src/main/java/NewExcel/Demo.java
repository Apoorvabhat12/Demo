package NewExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\apoora\\eclipse-workspace\\ExcelTest\\src\\main\\java\\excelUtility\\names.xlsx");
		
		FileInputStream ip = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(ip);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum()+1;
		
		//System.out.println(rowcount);
		
		int rowcount1 = sheet.getPhysicalNumberOfRows();
		
		//System.out.println(rowcount1);
		
		//System.out.println("--------------");
		
		int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();
		
		//System.out.println(noOfColumns);
		
		
		int noOfColumns1 = sheet.getRow(0).getLastCellNum();
		
		//System.out.println(noOfColumns1);
		
		
		//System.out.println("--------------");
		
		for(int i=0;i<noOfColumns;i++)
		{
		
		String col1 = sheet.getRow(0).getCell(i).getStringCellValue();
		
		System.out.println(col1);
		
		}
		

	}

}
