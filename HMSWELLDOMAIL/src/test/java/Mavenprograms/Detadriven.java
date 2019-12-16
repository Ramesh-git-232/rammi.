package Mavenprograms;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Detadriven {
	public WebDriver driver;
  @Test
  public void login() throws IOException,  Exception {
	  FileInputStream fi = new FileInputStream("C:\\Users\\91991\\Desktop\\Mithaiwala_Sweets_2020\\Mithaiwala_Sweets_2020\\SwamyKumar_Selenium_Workspace_2025\\17 Datadriven_Gmaillogin\\13Gmaillogin.xlsx");
	         Workbook wb = Workbook.getWorkbook(fi);
	       Sheet s = wb.getSheet("Gmail");
	       
			 driver.findElement(By.id("identifierId")).clear();
		
			 driver.findElement(By.id("identifierId")).sendKeys(s.getCell(0, 1).getContents());
			 driver.findElement(By.xpath(".//*[@id='identifierNext']/content")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.name("password")).sendKeys(s.getCell(1, 1).getContents());
			 driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
				Thread.sleep(10000);
	       
	       
	       
	       
	       
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://gmail.com");
	  Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
