package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Robot;
import java.awt.Window;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.testng.annotations.AfterTest;

public class Indigo {
	public WebDriver driver;
	public Actions action;
  @Test
  public void book () throws Exception   {
	  action = new Actions(driver);
	 driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[2]/div[2]/label/label")).click();
    driver.findElement(By.name("or-src")).sendKeys("Hyd");
    driver.findElement(By.name("or-src")).click();
    
   
     
  
  }
  @BeforeTest
  public void openurl() throws Exception {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.goindigo.in");
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	 // driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[18]/div/button[1]")).click();
	  Thread.sleep(5000);
	  
	  
	 }

  @AfterTest
  public void afterTest() {
  }

}
