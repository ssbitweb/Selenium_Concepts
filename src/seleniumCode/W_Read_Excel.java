package seleniumCode;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


// Q . Write a code to read excel file?
/*
Excel=======

sachin  pass@01
ajay    pass@02
pallavi pass@03

*/

public class W_Read_Excel {
	
	public static void main(String[] args) {
		
		XSSFWorkbook wb;
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Selenium_Automation\\Projects\\Selenium_Concepts\\src\\userData.xlsx");
			wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet("Sheet1");
			XSSFCell cell = sh.getRow(2).getCell(0); // read data
			
			System.out.println(cell); // Pallavi
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
