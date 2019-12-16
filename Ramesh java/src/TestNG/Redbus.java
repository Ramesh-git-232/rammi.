package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Redbus {
	public WebDriver driver;
	//public Actions action;
	
  @Test (priority = 1)
  public void reservation() throws Exception {
	  
	  
	  //action = new Actions(driver);
	  driver.findElement(By.id("src")).click();
	  driver.findElement(By.id("src")).sendKeys("Hyderabad (All Locations)");
	  Thread.sleep(3000);
	   // WebElement ele = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li"));
	    //action.moveToElement(ele).build().perform();
	     
	  driver.findElement(By.id("dest")).click();
	  driver.findElement(By.id("dest")).sendKeys("Bangalore (All Locations)");
	  Thread.sleep(3000);
	 //WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/div/ul/li"));
	  //action.moveToElement(ele2).build().perform();
	  driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
	  driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[6]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/div/label")).click();
	  driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[7]/td[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("search_btn")).click();
	  Thread.sleep(2000);}
  @Test (priority = 2)
  public void book () throws Exception {
	  
	  
	  driver.findElement(By.xpath("//*[@id=\'10665835\']/div/div[2]/div[1]")).click();
	  Thread.sleep(3000);
	  //driver.findElement(By.xpath("//*[@id=\"rt_12341669\"]/div/div/div/div[3]/div[2]/div[2]/canvas")).click();
	  //driver.findElement(By.xpath("//*[@id=\"12341669\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[1]/ul/li[1]/div[1]/div")).click();
	  driver.findElement(By.xpath("//*[@id='12341669']/div/div[2]/div[1]")).click(); 
	
  }
  @BeforeTest
  public void opnurl()  {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.redbus.in");
	  driver.manage().window().maximize();
	 
	
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
