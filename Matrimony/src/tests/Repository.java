package tests;

import org.testng.annotations.Test;

import Pages.Locators;
import Pages.TestData;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Repository {
	public static WebDriver driver;
  @Test
 public static void verifylogin() throws Exception {
	  driver.findElement(Locators.Gmail).sendKeys(TestData.Gmail);
	  Thread.sleep(3000);
	  driver.findElement(Locators.Next).click();
	  Thread.sleep(4000);
	  driver.findElement(Locators.Password).sendKeys(TestData.Password);
	  Thread.sleep(4000);
	  driver.findElement(Locators.Submit).click();
	  Thread.sleep(3000);
	  
	  
	  
		  
	  }
	  
	  
	  
  
  @BeforeTest
  public void oenurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
		driver.get(TestData.url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
