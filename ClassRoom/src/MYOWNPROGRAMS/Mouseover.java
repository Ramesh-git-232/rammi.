package MYOWNPROGRAMS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Mouseover {
	
	public WebDriver driver;
	public Actions action;
	
  @Test(priority = 1)
  public void loginoverfun() throws Exception {
	  
	  action = new Actions(driver);
	  
	  WebElement ele = driver.findElement(By.id("ctl00_HyperLinkLogin"));
	  action.moveToElement(ele).build().perform();
	  
	Thread.sleep(3000);
  }
	
	@Test(priority = 2)
	  public void loginoverfun1() throws Exception {
		  
	  WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[14]/ul/li[2]/a"));
	  action.moveToElement(ele2).build().perform();
	  
	
	Thread.sleep(3000);
	  driver.findElement(By.linkText("Member Login")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver   = new ChromeDriver();
	  driver.get("http://spicejet.com/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
