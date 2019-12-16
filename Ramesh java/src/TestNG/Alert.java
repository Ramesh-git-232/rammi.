package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alert {
	public WebDriver driver;
	

  @Test
  public void login() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("dfgsfsf");
	  driver.findElement(By.name("password")).sendKeys("sdsfs");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  
  }
  @BeforeClass
  public void openurl() throws InterruptedException {
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
