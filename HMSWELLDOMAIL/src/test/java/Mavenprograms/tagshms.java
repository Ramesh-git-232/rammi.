package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class tagshms {
	public WebDriver driver;
  @Test
  public void testing() {
	  List<WebElement> mis=driver.findElements(By.tagName("a"));
	  System.out.println(mis.size());
	  for (int i = 0; i < mis.size(); i++) {
	if (mis.get(i).getText().equalsIgnoreCase("")) {
		System.out.println(mis.get(i).getText());
		
	}
		
	}
		
	
		
	
	  
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.matrimony.com/");
	  driver.manage().window().maximize();
	 /// manage().deleteAllCookies();
	  Thread.sleep(3000);
	
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
