package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Validition4{
	public WebDriver driver;
	
	
  @Test
  public void logout() throws Exception {
	  driver.findElement(By.id("gh-cat")).click();
	  Thread.sleep(2000);
	  String ExpectedTitle = "Charity";
	  String ActualTitle   = driver.getTitle();
	  try { System.out.println("its visible");}
	  catch (Exception e) {
		  System.out.println("not visible");
		// TODO: handle exception
	
}
	  
  }
  @BeforeTest
  public void opnurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.ebay.in");
	  
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
