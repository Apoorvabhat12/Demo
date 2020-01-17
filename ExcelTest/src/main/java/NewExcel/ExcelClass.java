package NewExcel;

import org.openqa.selenium.By;

public class ExcelClass {

	public static void main(String[] args) throws Exception {
		
		
		
		Library lib = new Library("C:\\Users\\apoora\\eclipse-workspace\\ExcelTest\\src\\main\\java\\excelUtility\\names.xlsx");
		
		int count = lib.getRows("Sheet1");
		
		System.out.println(count);
		
		for(int i=1; i<count ; i++ )
		{
			
		String data = lib.getData("Sheet1", i, 0);
		
		System.out.println(data);
		
		String data1 = lib.getData("Sheet1", i, 1);
		
		System.out.println(data1);
		
		
		String data2 = lib.getData("Sheet1", i, 2);
		
		System.out.println(data2);
		
		System.out.println("--------");
		
		lib.setData("Sheet1",i,3,"pass");
		
		}
		
		
		
		
		
		
		boolean condition = lib.addColumn("Sheet1", "status");
		
		System.out.println(condition);

	}

}
