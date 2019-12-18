package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class SpicejetMouseover {
	public WebDriver driver;
	public Actions action;
  @Test
  public void mouseover() throws Exception {
	  action = new Actions(driver);
	  WebElement ele = driver.findElement(By.id("ctl00_HyperLinkLogin"));
	  action.moveToElement(ele).build().perform();
	  Thread.sleep(2000);
	                
WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[15]/ul/li[2]/a"));
	  action.moveToElement(ele2).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Member Login")).click();
	  
	   
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
