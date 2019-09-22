package learnTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.fail;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	   private WebDriver driver;
	  //  private String baseUrl;
  @Test
  public void f() {
	  driver.get("http://5elementslearning.com/demosite");
	    driver.findElement(By.cssSelector("#tdb3 > span.ui-button-text")).click();
	    driver.findElement(By.name("email_address")).clear();
	    
	driver.findElement(By.name("email_address")).sendKeys("abc@demo.com");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("demo@123");
	    driver.findElement(By.id("tdb5")).click();
	    driver.findElement(By.linkText("Log Off")).click();
	    driver.findElement(By.linkText("Continue")).click();
  }
  @BeforeTest
  public void beforeTest() {
	 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\veronica\\Downloads\\Training downloads\\chromedriver.exe");//set the chrome driver
			driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
		driver.close();
  }
 
}
