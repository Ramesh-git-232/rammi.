package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Spicejetmouseover {
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void f() throws Exception {

	  action = new Actions(driver);
	   WebElement ele = driver.findElement(By.id("ctl00_HyperLinkLogin"));
	   action.moveToElement(ele).build().perform();
	   Thread.sleep(2000);
	   
	   WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[14]/ul/li[2]/a"));
	   action.moveToElement(ele2).build().perform();
	   Thread.sleep(2000);
	   driver.findElement(By.linkText("Member Login")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID")).sendKeys("9912516013");
	   driver.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword")).sendKeys("ddrdefr");
	   Thread.sleep(2000);
	   driver.findElement(By.linkText("SIGN UP")).click();
	         
  }
  
  @BeforeTest
  public void openurl() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
