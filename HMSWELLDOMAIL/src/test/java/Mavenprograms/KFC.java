package Mavenprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class KFC {
	public WebDriver driver;
	//ChrmeOptions options = new ChromeOptions();
 
	
	@Test (priority=1)
 public void login() throws Exception {
	  
    
	 //options.addArguments("--disable-notificoations"); 
	driver.findElement(By.xpath("//*[@id=\"primary-header\"]/div[2]/div/div/div[2]/div/div[3]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("Email")).sendKeys("rammidrums@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("Password")).sendKeys("rami@143");
	driver.findElement(By.xpath("//*[@id=\"RenderBodyDiv\"]/div/div/div[2]/div[1]/div/div/div/div/form/div/div[3]/button")).click();
    Thread.sleep(5000);
  }
	@Test (priority=2)
	public void select() throws Exception {
		
		
	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"RenderBodyDiv\"]/div/div/div[2]/div/div/div[2]/div/div/div/div[3]/ul/li[1]/div/div")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"menu_cat_outerwrapper\"]/div/div[3]/div/div/ul/li[1]/div/div/div/div[2]/div/button")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("geocomplete")).sendKeys("Dehradun, Uttarakhand, India");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"start_myOrder_outerDiv\"]/button/span")).click();
	Thread.sleep(4000);
	}
@Test (priority=3)
public void addselection ()throws Exception {
	
	 
	 driver.findElement(By.xpath("//*[@id=\"RenderBodyDiv\"]/div/div/div[2]/div[1]/div/div[2]/div/div[1]/div/div[4]/a")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.id("txtCity")).sendKeys("4-112/flatno5");  
	 Thread.sleep(3000);
	 driver.findElement(By.id("txtTitle")).sendKeys("gandhiNagar");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"checkoutForm\"]/div/div[4]/div/ul/li[3]/a")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.id("myAccountSubmit")).click();
	 Thread.sleep(4000);          }

  @BeforeTest
  public void openurl() throws Exception {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\selennium\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  // WebDriver driver =new ChromeDriver(options);
	  driver.get("https://online.kfc.co.in");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  }

  @AfterTest
  public void afterTest() {
  }

}
