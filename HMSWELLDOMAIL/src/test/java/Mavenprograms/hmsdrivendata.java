package Mavenprograms;

import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sql.RowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;
import org.testng.annotations.AfterTest;

public class hmsdrivendata {
	public WebDriver driver;
  @Test
  public void login() throws JXLException, IOException, InterruptedException {
	  FileInputStream fi = new FileInputStream("C:\\Users\\91991\\Documents\\book 2.xls");
	  Workbook w = Workbook.getWorkbook(fi);
	  	Sheet s=w.getSheet(1);
	  	int rows = 0;
		for (int i = 1; i <=(rows-1); i++) {



	  	//Enter username,Password and click on signin by taking data from input file
	  		
	  	driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
	  	Thread.sleep(3000);
	  	driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
	  	Thread.sleep(3000);

	  	driver.findElement(By.name("submit")).click();
	  	Thread.sleep(5000);
		
	}
	  
	  
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite");
	  driver.manage().window().maximize();
	 /// manage().deleteAllCookies();
	  Thread.sleep(3000);
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
