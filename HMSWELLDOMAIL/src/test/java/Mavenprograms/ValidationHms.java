package Mavenprograms;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ValidationHms {
	private static final String Assert = null;
	public WebDriver driver;
	
  @Test
  public void login() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  String ExpectedTitle = "Loguot";
	  String ActualTitle = driver.getTitle();
	 
	  
	  try{

	
	  
	  System.out.println("viseble");
	  
	  }
	  catch (Throwable t){
		  
		
	  System.out.println("no");}
	  
	  
	 

	
}
@BeforeTest
  public void openurl() throws InterruptedException {
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
