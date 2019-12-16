package Mavenprograms;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Detadriven3 {
	
	public WebDriver driver;
	public String str;
	private int rows;
	 
  @Test
  public void login() throws IOException, Exception {
	  //read the data from the inputfile
	 
	  FileInputStream fi = new FileInputStream("C:\\Users\\91991\\Documents\\book 2.xls");
	 Workbook w = Workbook.getWorkbook(fi);
	 Sheet s = w.getSheet(1);
	 int rows = ((XSSFSheet) s).getPhysicalNumberOfRows();
	 for (int i = 1; i <=(rows-1); i++) {
		 //driver.findElement(By.name("username")).sendKeys(ws.getRow(i).getCell(0).getStringCellValue());
			Thread.sleep(3000);	
		//org.apache.poi.ss.usermodel.Cell cell= s.getRow(i).length;

	//	cell.setCellType(org.apache.poi.ss.usermodel.CellType.STRING);
//			driver.findElement(By.name("password")).sendKeys( cell.getStringCellValue());
		 
		 driver.findElement(By.name("submit")).click();
		 try {driver.findElement(By.linkText("Logout")).click();
		 str = "pass";}
		 catch (Exception e) { str ="fail";}
			// TODO: handle exception
		 }
		 
		
	
	  
		  
		
	}
	  
	  
  
  @BeforeTest
  public void openurl() {
	  // To set the path of the Chrome driver.
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	       
	      // To launch facebook
	      driver.get("http://www.computechis.com/DemoSite");
	      // To maximize the browser
	      driver.manage().window().maximize();
	      // implicit wait
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
