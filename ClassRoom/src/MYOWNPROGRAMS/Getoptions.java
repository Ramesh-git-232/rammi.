package MYOWNPROGRAMS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Getoptions {
	
	public WebDriver driver;
	
  @Test
  public void functionFlow() {
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Registration")).click();
	  
	  
	List<WebElement> Relations = new Select(driver.findElement(By.name("RELATION"))).getOptions();
  
	System.out.println(Relations.get(1).getText());
	
	for (int i = 0; i < Relations.size(); i++) {
		
		System.out.println(Relations.get(i).getText());
		
	}
  
  }
  @BeforeTest
  public void beforeTest() {
	 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver   = new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite/");
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
