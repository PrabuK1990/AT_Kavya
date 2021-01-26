package testScripts;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import reusables.SignInPage;

public class HomePageMultipleEntries extends SignInPage{
	
	@BeforeTest
	 @Parameters("browser")  
	public void startSession(String browser) throws IOException, InterruptedException {
		loadInputsfromConfigExcel();
		launchBrowser(browser);
		maximizeBrowser();
		enterUrl(url);
	}
	
	@Test//Smoke Test
	public void positiveScenario01() throws InterruptedException, AWTException, IOException {
		
		FileInputStream file = new FileInputStream(new File("resources/MariottInputs.xlsx"));
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for (Row row : sheet) {
            Cell cell = row.getCell(0);
            if(cell.getStringCellValue().equalsIgnoreCase("Yes")) {
            	String dest = row.getCell(1).getStringCellValue();
            	String startDate = row.getCell(2).getStringCellValue();
            	String endDate = row.getCell(3).getStringCellValue();
            	String rooms = row.getCell(4).getStringCellValue();
            	String adults = row.getCell(5).getStringCellValue();
            	String childrens = row.getCell(6).getStringCellValue();
            	String specialrates = row.getCell(7).getStringCellValue();
            	
            	findHotels(dest, startDate, endDate, rooms, adults, childrens, specialrates);
            	enterUrl(url);
            	clearDestination();
            }
        }
		
	}
	
	@AfterTest
	public void closeSession() {
		closeCurrentBrowser();
	}

}
