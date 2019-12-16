package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Popup<E> {
	public WebDriver driver;
  @Test(priority = 1)
  public void login() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("dfgsfsf");
	  driver.findElement(By.name("password")).sendKeys("sdsfs");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();}
  @Test(priority = 2)
  public void feedback() throws Exception  {
	  driver.findElement(By.linkText("Feedback")).click();
	  String parent = driver.getWindowHandle();
	  for ( String     chaild : driver.getWindowHandles()) {
	  driver.switchTo().window(chaild);
	  }
	  driver.findElement(By.id("name")).sendKeys("ramya");
	  driver.findElement(By.id("email")).sendKeys("rammidrums@gmail.com");
	  driver.findElement(By.id("car")).click();
	  new Select(driver.findElement(By.id("car"))).selectByVisibleText("Volvo");
	   List<E>cars = (List<E>) new Select(driver.findElement(By.id("car"))).getOptions();
	   System.out.println(((WebElement) cars.get(1)).getText());
	   for (int i = 0; i < cars.size(); i++) {
		System.out.println(((WebElement) cars.get(i)).getText());}
	    
	   
		driver.findElement(By.name("radio")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]/input")).sendKeys("C:\\Users\\91991\\Pictures\\Camera Roll");
		driver.findElement(By.id("message")).sendKeys("rddtyddryt");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		
	
	    
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
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
