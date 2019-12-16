package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class swiggy {
	public WebDriver driver;
	
	
  @Test
  public void login() throws Exception {
	  driver.findElement(By.linkText("Login")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("mobile")).sendKeys("9912516013");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")).click();
	  Thread.sleep(2000);
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.swiggy.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
