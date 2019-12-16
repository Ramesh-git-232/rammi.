package Mavenprograms;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class CrossbrowserScript {
	private static final String browser = null;
	WebDriver driver;
  @Test
  public void testparameterwithxml() {
	  driver.get("http://www.computechis.com/DemoSite");
	  WebElement name = driver.findElement(By.name("username"));
	  name.sendKeys("admin");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("admin");
	  WebElement login =  driver.findElement(By.name("submit"));
	  login.click();
	  
	  
  }
  @BeforeTest
  @org.testng.annotations.Parameters("browser")
	public void VerifyTitlepage(String browserName)
    {
	  if (browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
		  driver = new ChromeDriver();}
	  else if (browser.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\91991\\Downloads\\geckodriver.exe");
		 driver = new FirefoxDriver();}
	  
		
	else {System.out.println("browser is not correct");

	}
	
	}
		
	
	  
  

  @AfterTest
  public void afterTest() {
  }

}
