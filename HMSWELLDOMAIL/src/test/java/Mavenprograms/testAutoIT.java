package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testAutoIT {
	public WebDriver driver;
  @Test
  public void login() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Registration")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.name("image")).click();
	  Thread.sleep(3000);
	  //Runtime.getRuntime().exec("C:\\Users\\91991\\Pictures\\Camera Roll\\WIN_20191213_10_51_33_Pro.jpg");
	  
  }
  @BeforeTest
  public void opnurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.computechis.com/DemoSite");
	  driver.manage().window().maximize();
	 /// manage().deleteAllCookies();
	  Thread.sleep(3000);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
