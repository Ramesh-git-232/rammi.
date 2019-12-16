package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class printVal {
	public WebDriver driver;
  @Test
  public void testing() {
	  driver.findElement(By.linkText("Join")).click();
	  driver.findElement(By.id("Submitbtn")).click();
	  
	  
	 /* System.out.println(driver.findElement(By.xpath("//span[contains(text(),'The First name field is required.')]")).isDisplayed());
	  System.out.println(driver.findElement(By.xpath("//span[contains(text(),'The First name field is required.')]")).getText());*/
	  
	  System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Please Enter Above Text')]")).getText());
	
	  
	Select s =  new Select(driver.findElement(By.id("TypeofUser")));
	
	java.util.List<WebElement>  l = s.getOptions();
	
	for(int i =0; i<l.size();i++)
	{
		System.out.println(l.get(i).getText());
	}
  }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://dynamicsexchange.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
