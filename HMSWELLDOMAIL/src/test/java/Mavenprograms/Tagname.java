package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Tagname {
	public WebDriver driver;
  @Test
  public void test() {
	  java.util.List<WebElement> str = driver.findElements(By.tagName("a"));
		System.out.println(str.size());
		
		for (int i = 0; i < str.size(); i++) {
			
			if (str.get(i).getText().equalsIgnoreCase("")) {
				
			
				//System.out.println("Maintaining some gaps in Application");
				
			}
				
				System.out.println(str.get(i).getText());
				
			}
	  
  }
  @BeforeTest
  public void openurl() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
