package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Savarivalidation {
	
	private static final WebElement RoundTripbutton = null;
	public WebDriver driver;
	
  @Test
  public void val() {
	boolean local = driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[1]")).isDisplayed();
	  if(RoundTripbutton.isEnabled())
	  {
	   System.out.print("\n Its Displayed");
	  }
	  else
	  {
	   System.out.print("\n Its Not Displayed");
	  }
	  
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://savaari.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000); 
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
