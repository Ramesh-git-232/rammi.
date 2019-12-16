     package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class spicejet {
	public WebDriver driver;
	
 @Test
  public void login() throws Exception {
	 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	 driver.findElement(By.linkText("Jaipur (JAI)")).click();
	 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.linkText("Mumbai (BOM)")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.linkText("21")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
	 driver.findElement(By.linkText("26")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.id("divpaxinfo")).click();
	 new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("2");
	 driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
	 new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
	 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	 Thread.sleep(3000);
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\91991\\Downloadnnium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  
  }

}