package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Validation5<E>{
	public WebDriver driver;
  @Test
  public void log() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Registration")).click();
	 // driver.findElement(By.name("RELATION")).click();
 //java.util.List<WebElement> list	 = new Select (driver.findElement(By.name("PATIENT_CAT"))).getOptions();

                   //  System.out.println(list.get(5).getText());
                    // for (int i = 0; i < list.size(); i++) {
                    	//System.out.println(list.get(i).getText()); }
                     
  
          java.util.List<WebElement>    list2  	= new Select(driver.findElement(By.name("NATIONALITY"))).getOptions();
						System.out.println(list2.get(5).getText());
						for (int i1 = 0;i1 <list2.size(); i1++) {
							
						}
					}

  
	  
  
 

	
//}
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
