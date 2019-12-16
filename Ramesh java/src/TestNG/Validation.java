package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Validation {
	public WebDriver driver;
	
  @Test
  public void validation() {
 WebElement   str =  (WebElement) new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getAllSelectedOptions();
	  System.out.println(str.getText());
	  if(str.getText().equalsIgnoreCase("INR"));{
		  System.out.println("dropdown validation pass = INR");
		  }
	 // else{
			
			//System.out.println("dropdown validation failed");
	  //}
	  
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	   
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
