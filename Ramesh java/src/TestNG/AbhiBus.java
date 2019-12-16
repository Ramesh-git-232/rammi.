package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class AbhiBus {
	public WebDriver driver;
	//public Actions action;
  @Test
  public void booking() throws Exception {
	 //action = new Actions(driver);
	  driver.findElement(By.id("source")).sendKeys("Hyderabad");
	  Thread.sleep(3000);
	 // WebElement ele = driver.findElement(By.id("ui-id-7"));
	  //action.moveToElement(ele).build().perform();
	  
	  driver.findElement(By.id("destination")).sendKeys("Bangalore");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"frmFinal\"]/span/img")).click();
	     // WebElement ele2 = driver.findElement(By.id("ui-id-27"));
	   //action.moveToElement(ele2).build().perform();
	  
	 driver.findElement(By.id("datepicker1")).click();
	  driver.findElement(By.linkText("27")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.linkText("Search")).click();
	  Thread.sleep(3000);
	  
	  
  }
  @BeforeTest
  public void openurl() throws Exception  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.abhibus.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
