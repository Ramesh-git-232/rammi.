package MYOWNPROGRAMS;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alerts {
	
	public WebDriver driver;
	
	
  @Test
  public void login() throws Exception {
	  

	  FileInputStream fi = new FileInputStream("D:\\iostreams swamy kumar\\2Login.gmail.xls");
		
	  /*
		 * Workbook wb = Workbook.getWorkbook(fi); Sheet s = wb.getSheet("Gmail");
		 */
		 
      driver.findElement(By.name("username")).sendKeys("dgdgggggggg");
      driver.findElement(By.name("password")).sendKeys("sfsfffffffff");
      driver.findElement(By.name("submit")).click();
      
    
      
      String str = driver.switchTo().alert().getText();
      System.out.println(str);
      Thread.sleep(3000);
      //closing alert
      driver.switchTo().alert().accept();
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver   = new FirefoxDriver();
	  driver.get("http://www.computechis.com/DemoSite/");
		 
		  
  }

  @AfterTest
  public void afterTest() {
  }

}
