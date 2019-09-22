package projectnew;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangePhone {
	WebDriver driver;
	  
	/*Write down a junit test script with assertions and synchronization 
	for the change profile scenario, where you update the
	telephone number. */

	  @Before
	  public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
		driver=new ChromeDriver();
		
	}

	  @Test
	  public void recordupdate() throws Exception {
	    driver.get("http://5elementslearning.com/demosite");
	    
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.name("email_address")).clear();
		driver.findElement(By.name("email_address")).sendKeys("abc@demo.com");
		driver.findElement(By.name("password")).clear();
		
driver.findElement(By.name("password")).sendKeys("demo@123");
		driver.findElement(By.id("tdb5")).click();
		
	  /*  WebDriverWait wait = new WebDriverWait(driver, 20);  
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("JUNK"))); *///explicit wait- dynamic wait/ 
	    WebElement Updaterecordlink=driver.findElement(By.linkText("View or change my account information."));//.click();
	   
	    Updaterecordlink.click();
	    WebElement Phonenumber=driver.findElement(By.name("telephone"));
	    Phonenumber.clear();
	    Phonenumber.sendKeys("987678");
	    driver.findElement(By.linkText("Continue")).click();
	    
	    driver.findElement(By.linkText("Log Off")).click();
	  //  driver.findElement(By.linkText("Continue")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	  //  driver.close();
	     }
}
