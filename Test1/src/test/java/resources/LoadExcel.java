package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoadExcel {
	
	public String url;
	public String usr;
	public String pass;
	public String dest;
	public String startDate;
	public String endDate;
	public String rooms;
	public String adults;
	public String childrens;
	public String specialrates;
	
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
	
	public void loadHomePageInputs() throws IOException{
		FileInputStream file = new FileInputStream(new File("resources/MariottInputs.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for (Row row : sheet) {
            Cell cell = row.getCell(0);
            if(cell.getStringCellValue().equalsIgnoreCase("Yes")) {
            	dest = row.getCell(1).getStringCellValue();
        		startDate = row.getCell(2).getStringCellValue();
        		endDate = row.getCell(3).getStringCellValue();
        		rooms = row.getCell(4).getStringCellValue();
        		adults = row.getCell(5).getStringCellValue();
        		childrens = row.getCell(6).getStringCellValue();
        		specialrates = row.getCell(7).getStringCellValue();  
            }
        }
	}
	
	
	
	public static void main (String args[]) throws IOException {
//		
//		FileInputStream file = new FileInputStream(new File("resources/MariottInputs.xlsx"));
//		
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		
//		for (Row row : sheet) {
//            Cell cell = row.getCell(0);
//            if(cell.getStringCellValue().equalsIgnoreCase("Yes")) {
//            	Destination = row.getCell(1).getStringCellValue();
//        		String StartDate = row.getCell(2).getStringCellValue();
//        		String EndDate = row.getCell(3).getStringCellValue();
//        		String Rooms = row.getCell(4).getStringCellValue();
//        		String Adults = row.getCell(5).getStringCellValue();
//        		String Childrens = row.getCell(6).getStringCellValue();
//        		String Specialrates = row.getCell(7).getStringCellValue();
//                
//            }
//        }
    }

}
