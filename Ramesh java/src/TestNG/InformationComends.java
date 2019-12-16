package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class InformationComends {
	public WebDriver driver;
  @Test(priority = 1)
  public void f() {
String	str1 = driver.findElement(By.linkText("Gmail")).getText();
	  System.out.println(str1);}
  
  @Test(priority = 2)
  public void dfdf() {
	  String srt2 = driver.findElement(By.name("btnK")).getAttribute("value");
	  
	System.out.println(srt2);}
  @Test (priority = 3)
  public void sfsf() {
        String	str3 = driver.findElement(By.id("hplogo")).getAttribute("alt");
	  System.out.println(str3);}
  
  @Test(priority = 4)
  public void zdac(){
	  
String	str4 = driver.findElement(By.linkText("Images")).getText();
	  System.out.println(str4);
  }
  @BeforeTest
  public void opnurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
