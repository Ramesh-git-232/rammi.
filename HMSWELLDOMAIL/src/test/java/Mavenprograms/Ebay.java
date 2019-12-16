package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Ebay {
	public WebDriver driver;
	
	
  @Test
  public void login() {
List<WebElement> list= new Select(driver.findElement(By.id("gh-cat"))).getOptions();
	 // System.out.println(list.get(4).getText());
	  for (int i = 0; i < list.size(); i++) {
		 System.out.println(list.get(i).getText());
		
			
		}
	}
	  
	  
  
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://in.ebay.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
