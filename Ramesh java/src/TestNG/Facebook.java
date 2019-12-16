package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Facebook {
	public WebDriver driver;
	
	
  @Test
  public void lohin() throws Exception{
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
  public void beforeTest() throws Exception  {
	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	 driver   = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	 
	  Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
