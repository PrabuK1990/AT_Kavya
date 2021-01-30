package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadExcel {
	
	public String url;
	public String usr;
	public String pass;
	
	public void loadDataExcel() throws IOException
	{
	
	FileInputStream file = new FileInputStream(new File("resources/Data.xlsx"));
	
	System.out.println("check 1");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	System.out.println("check 2");
	
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	System.out.println("check 3");
	
	for (Row row : sheet) {
        Cell cell = row.getCell(0);
        if(cell.getStringCellValue().equalsIgnoreCase("Yes")) {
        	
        	url = row.getCell(1).getStringCellValue();
    		usr = row.getCell(2).getStringCellValue();
    		pass = row.getCell(3).getStringCellValue();
	
	}

}
}
}