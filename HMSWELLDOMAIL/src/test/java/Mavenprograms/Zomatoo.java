package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Zomatoo {
	public WebDriver driver;
	public Actions action;
  @Test
  public void booking() throws Exception {
	  action = new Actions(driver);
	  driver.findElement(By.id("location_input_sp")).click();
	       WebElement ele = driver.findElement(By.id("location-all"));
	       action.moveToElement(ele).build().perform();
	  Thread.sleep(3000);
	  driver.findElement(By.id("keywords_input")).click();
	 WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"popular-results\"]/li[2]/span[1]/div/span/span[2]"));
	  action.moveToElement(ele2).build().perform();
	  driver.findElement(By.id("search_button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"orig-search-list\"]/div[1]/div[2]/a[3]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"menu_0\"]/div/div/div/div/div/div[3]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[13]/div/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Nagarjuna Home, Kukatpally");
	  driver.findElement(By.name("address")).sendKeys("4-112 road no1 kphp");
	  driver.findElement(By.name("instructions")).sendKeys("apposite axis bank");
	  driver.findElement(By.linkText("Home")).click();
	  driver.findElement(By.xpath("/html/body/div[13]/div/div[2]/button")).click();
	  Thread.sleep(2000);
	  
  }
  @BeforeTest
  public void opnurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.zomato.com/hyderabad");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
