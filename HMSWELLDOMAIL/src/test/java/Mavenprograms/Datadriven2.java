package Mavenprograms;

import org.testng.annotations.Test;

import jxl.CellType;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Datadriven2 {
	public WebDriver driver;
	
	
	//to store the data create varible
	public String str;
	//path of the exel file
	String path ="C:\\Users\\91991\\Documents\\book 2.xls";
  @Test
  public void login() throws Exception {
	  //reading exel file
	  File file = new File(path);
	  FileInputStream fi = new FileInputStream(file);
	  org.apache.poi.hssf.usermodel.HSSFWorkbook wb = new org.apache.poi.hssf.usermodel.HSSFWorkbook(fi);
	  HSSFSheet ws = wb.getSheetAt(0);
	  int rows = ws.getPhysicalNumberOfRows();
	  for (int i = 1; i <=(rows-1); i++) {
	driver.findElement(By.name("username")).sendKeys(ws.getRow(i).getCell(0).getStringCellValue());
	Thread.sleep(3000);	
org.apache.poi.ss.usermodel.Cell cell= ws.getRow(i).getCell(1);

cell.setCellType(org.apache.poi.ss.usermodel.CellType.STRING);
	driver.findElement(By.name("password")).sendKeys( cell.getStringCellValue());
	driver.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	try {
		driver.findElement(By.linkText("Logout")).click();
		str = "pass";}
	catch (Exception e) {str = "fail";
		// TODO: handle exception
	//create the header
	ws.getRow(0).createCell(2).setCellValue("Results");
	//writing the results
	ws.getRow(i).createCell(2).setCellValue(str);
	//excel output path
	String path1 = "C:\\Users\\91991\\Documents\\Book1.xls";
	File file1 = new File(path1);
	FileOutputStream fo = new FileOutputStream(file1);
	wb.write(fo);
	wb.close();
	driver.close();
	}
	
	  
	  }  
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
