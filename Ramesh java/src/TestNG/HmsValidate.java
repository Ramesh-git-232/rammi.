package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class HmsValidate {
	public WebDriver driver;
	
	
  @Test
  public void login() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();  
	  driver.findElement(By.linkText("Registration")).click(); 
	  java.util.List<WebElement> values = new Select(driver.findElement(By.name("RELATION"))).getOptions(); 
	  
		 if (values.get(4).getText().contains("Mother")) {
			 
			 System.out.println("Yes its corect");
			
		}
		 
		 else {
			System.out.println("Not correct");}	
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
