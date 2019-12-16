package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AjaxControl<E> {
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.name("q")).sendKeys("Google");
	  
		 List<WebElement> allvalueslist = driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/div[2]/ul/li[8]/div/div[2]/div"));
			
		  for (int i = 0; i < allvalueslist.size(); i++) {
			  
			  System.out.println(allvalueslist.get(i).getText());
			  
			  if (allvalueslist.get(i).getText().contains("google account")) {
				  
				  allvalueslist.get(i).click();
				   break;	  
				
			}
			
			
		}
		
	
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
