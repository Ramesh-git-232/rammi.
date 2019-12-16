package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Flifcart {
	public WebDriver driver;
	
  @Test
  public void login() throws Exception {
	  driver.findElement(By.linkText("New to Flipkart? Create an account")).click();
	  Thread.sleep(3000);
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9912516013");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/button")).click();
	  
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
