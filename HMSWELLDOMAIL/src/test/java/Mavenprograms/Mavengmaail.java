package Mavenprograms;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Mavengmaail 
{
	public WebDriver driver;
  @Test
  
	  public void login() throws Exception{
	  
	
	 
	  FileInputStream fi = new FileInputStream("C:\\Users\\91991\\Desktop\\Mithaiwala_Sweets_2020\\Mithaiwala_Sweets_2020\\SwamyKumar_Selenium_Workspace_2025\\17 Datadriven_Gmaillogin\\13Gmaillogin.xlsx");
		 Workbook wb = Workbook.getWorkbook(fi);
		 Sheet s = wb.getSheet("Gmail");
		 
		// driver.findElement(By.id("identifierId")).sendKeys(s.getCell(0, 1).getContents());
		 driver.findElement(By.id("identifierId")).sendKeys(s.getCell(0, 1).getContents());
		 driver.findElement(By.id("pass")).sendKeys(s.getCell(1, 1).getContents());
		 
		 driver.findElement(By.id("u_0_m")).sendKeys("rami");
			driver.findElement(By.id("u_0_o")).sendKeys("rami");
			driver.findElement(By.id("u_0_r")).sendKeys("8919674230");
			driver.findElement(By.id("u_0_w")).sendKeys("chitti@rami112");
			driver.findElement(By.id("day")).click();
			new Select(driver.findElement(By.id("day"))).selectByVisibleText("19");
			driver.findElement(By.id("month")).click();
			new Select(driver.findElement(By.id("month"))).selectByVisibleText("Dec");
			driver.findElement(By.id("year")).click();
			new Select(driver.findElement(By.id("year"))).selectByVisibleText("1995");
			driver.findElement(By.id("u_0_7")).click();
			driver.findElement(By.id("u_0_13")).click();
			Thread.sleep(3000);
  }
  
  @BeforeTest
  public void beforeTest() throws Exception {
	 
			 
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
			 driver   = new ChromeDriver();
			  driver.get("https://www.facebook.com");
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			  Thread.sleep(3000);
			  
  }

  @AfterTest
  public void afterTest() {
  }

}
