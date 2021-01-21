package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadExcel {
	
	public String url;
	public String usr;
	public String pass;
	
	public void loadInputsfromConfigExcel() throws IOException {
		
		FileInputStream file = new FileInputStream(new File("resources/config.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for (Row row : sheet) {
            Cell cell = row.getCell(0);
            if(cell.getStringCellValue().equalsIgnoreCase("Yes")) {
            	
            	url = row.getCell(1).getStringCellValue();
        		usr = row.getCell(2).getStringCellValue();
        		pass = row.getCell(3).getStringCellValue();
            }
        }
			
	}
	
//	public static void main (String args[]) throws IOException {
//		
//		FileInputStream file = new FileInputStream(new File("resources/config.xlsx"));
//		
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		
//		for (Row row : sheet) {
//            Cell cell = row.getCell(0);
//            if(cell.getStringCellValue().equalsIgnoreCase("Yes")) {
//            	
//            	String url = row.getCell(1).getStringCellValue();
//        		String usr = row.getCell(2).getStringCellValue();
//        		String pass = row.getCell(3).getStringCellValue();
//        		
//        		System.out.println(url);
//        		System.out.println(usr);
//        		System.out.println(pass);
//                
//            }
//        }
//    }

}
