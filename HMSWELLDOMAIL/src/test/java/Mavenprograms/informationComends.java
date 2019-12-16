package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class informationComends {
	public WebDriver driver;
  @Test
  public void login() throws Exception {
	   String str1 = driver.findElement(By.linkText("Contact us")).getText();
	  System.out.println(str1);
	  Thread.sleep(3000);
	  String str2 = driver.findElement(By.linkText("About us")).getText();
	  System.out.println(str2);
	  String str3 = driver.findElement(By.xpath("//*[@id=\"section1\"]/div[1]/div/div[1]/span")).getText();
	  System.out.println(str3);
	  String str4 = driver.findElement(By.xpath("//div//input[@class='bm-reg-button']")).getAttribute("value");
	  System.out.println(str4);
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.matrimony.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
	  Thread.sleep(3000);
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
