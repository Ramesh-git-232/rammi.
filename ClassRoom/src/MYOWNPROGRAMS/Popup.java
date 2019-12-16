package MYOWNPROGRAMS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Popup {
	
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
      driver.findElement(By.name("password")).sendKeys("admin");
      driver.findElement(By.name("submit")).click();
      
      //Clicking on Feedback button
	  driver.findElement(By.xpath("//a[text()='Feedback']")).click();
	 
	  //Ladder
	  String paresntwin = driver.getWindowHandle();
	  
	  for(String newwinhandle : driver.getWindowHandles()) {
		  
		driver.switchTo().window(newwinhandle); 
		  
	  }
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Sitara");
//child wind close
	  
	  //again get back to home page
	  
		/*
		 * driver.switchTo().window(paresntwin);
		 * 
		 * 
		 * driver.findElement(By.linkText("Registration")).click();
		 */
	  
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
